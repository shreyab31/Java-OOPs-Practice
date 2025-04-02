class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL back;

    NodeDLL(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
    NodeDLL(int data, NodeDLL next, NodeDLL back){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class RemoveNnodeFromBack {
    public static NodeDLL convertArrToDll(int arr[]){
        NodeDLL head= new NodeDLL(arr[0]);
        NodeDLL prev=head;
        for(int i=1; i<arr.length; i++){
        NodeDLL newNode= new NodeDLL(arr[i], null, prev);
        prev.next=newNode;
        prev=newNode;
       }
        return head;
    }
    public static void printDLL(NodeDLL head){
        NodeDLL current=head;
        while (current!=null) {
            System.out.print(current.data+"-> ");
            current=current.next;
        }
        System.out.print("null");
    }
    public static NodeDLL removeNthNode(NodeDLL head, int n){
        NodeDLL current=head;
        while (current != null && current.next != null) {
            current = current.next;
        }
        int count=1;
        while (current.back!=null) {
            if (n==count) {
            current.back.next=current.next;
            if (current.next != null) {
                current.next.back = current.back;  
            }
               break;
            }
            count++;
            current=current.back;
            if (current==head) {
                head=head.next;
            }
        }
            return head;
        }
    public static NodeDLL brute(NodeDLL head, int n){
        NodeDLL temp=head;
        int count =0;
        if (head == null) {
        return null;
        }
    while(temp!=null){
        temp=temp.next;
        count++;
    }
    if (count==n) {
        head=head.next;
        return head;
}
    int res=count-n;
    temp=head;
    while(temp!=null){
        res--;
        if(res==0) break;
        temp=temp.next;
        
    }  
        temp.next=temp.next.next;
        return head;
        }
    public static NodeDLL optimal(NodeDLL head, int n){
        NodeDLL fast=head;
        NodeDLL slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        if (fast==null) return head.next;
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
        }
    public static void main(String[] args) {
        int arr[]={2, 3, 1, 4, 5, 6};
        NodeDLL head = convertArrToDll(arr);
        System.out.println("before removing\n");
        printDLL(head);
        System.out.println();
        //removeNthNode(head, 6);
        //head=brute(head, 6);
        head=optimal(head, 6);
        printDLL(head);
    }
}
