class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next= next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class RotateLL {
    public static Node createArrToLL(int arr[]){
        Node head= new Node(arr[0]);
        if (arr.length==0||arr.length==1) {
            return head;
        }
        Node current=head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode= new Node(arr[i]);
            current.next=newNode;
            current=newNode;
        }
        return head;
    }
    public static void printDLL(Node head){
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+"-> ");
            current=current.next;
        }
        System.out.print("null");
    }
    public static Node bruteRotate(Node head, int k){
        for (int i = 1; i <=k; i++) {
           Node temp=head;
           Node prev=null;
            while (temp.next!=null)  {
            prev=temp;
            temp=temp.next;
        }
        temp.next=head;
        head=temp;
        prev.next=null;
    }
    return head;
}
    static Node bruteStriv(Node head, int k) {
        if (head==null||head.next==null) return head;
        for (int i =0; i <k; i++) {
            Node temp=head;
            while (temp.next.next!=null) temp=temp.next;
            Node end=temp.next;
            temp.next=null;
            end.next=head;
            head=end;
        }
        return head;
    }
    static Node Optimal(Node head, int k){
        if (head==null||head.next==null) return head;    
        int len=1;
        Node temp=head;
        while (temp.next!=null) {
            ++len;
            temp=temp.next;
        }
        temp.next=head;
        k=k%len;
        int end=len-k;
        while (end--!=0) temp=temp.next;
        head=temp.next;
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=createArrToLL(arr);
        head=bruteRotate(head, 12);   
        //head=bruteStriv(head, 0);
        //head=Optimal(head, 0);
        printDLL(head);
    }
}
