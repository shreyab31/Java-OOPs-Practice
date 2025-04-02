class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL back;

    NodeDLL(int data, NodeDLL next, NodeDLL back){
        this.data=data;
        this.next=next;
        this.back=back;
    }

    NodeDLL(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class deletioninDLL {
    public static NodeDLL converArrToDll(int arr[]){
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
    public static NodeDLL deletehead(NodeDLL head){
        if (head==null||head.next==null) {
            return null;
        }
        NodeDLL prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public static NodeDLL deleteTail(NodeDLL head){
        NodeDLL current=head;
        NodeDLL prev=null;
        if (head==null||head.next==null) {
            return null;
        }
        while (current.next!=null) {
            current=current.next;
        }
        prev=current.back;
        current.back=null;
        prev.next=null;
        return head;
    }
    public static NodeDLL deleteKthNode(NodeDLL head, int k){
        if (head==null) {
            return null;
        }
        int count=0;
        NodeDLL current=head;
        while (current.next!=null) {
            count++;
        if (k==count) break;
        current=current.next;
        }
        NodeDLL front= current.next;
        NodeDLL prev=current.back;
        if (prev==null && front==null) {
            return null;
        }
        else if (prev==null) {
            return deletehead(head);
        }
        else if (front==null) {
            return deleteTail(head);
        }
        prev.next=front;
        front.back=prev;
        current.next=null;
        current.back=null;
        return head;
    }
    public static NodeDLL deleteByValue(NodeDLL head, int val){
        if (head==null) {
            return null;
        }
        NodeDLL current=head;
        while (current.next!=null) {
        if (current.data==val) break;
        current=current.next;
        }
        NodeDLL front= current.next;
        NodeDLL prev=current.back;
        if (prev==null && front==null) {
            return null;
        }
        else if (prev==null) {
            return deletehead(head);
        }
        else if (front==null) {
            return deleteTail(head);
        }
        prev.next=front;
        front.back=prev;
        current.next=null;
        current.back=null;
        return head;
    }
    public static void deleteNode(NodeDLL current){
        NodeDLL prev=current.back;
        NodeDLL front=current.next;
        if (front==null) {
            prev.next=null;
            current.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;
        current.next=current.back=null;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        NodeDLL head= converArrToDll(arr);
       // head=deletehead(head);
        //head=deleteTail(head);
        //head=deleteKthNode(head, 5);
        //head=deleteByValue(head,5);
        deleteNode(head.next.next.next);
        printDLL(head);
    }
}
