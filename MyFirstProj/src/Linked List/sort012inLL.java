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
public class sort012inLL {
    public static Node convertArrToLL(int arr[]){
        Node head;
        if (arr.length == 0) {
            head = null;
            return head;
        }
         head= new Node(arr[0]);
         Node current=head;
        for (int i=1; i<arr.length; i++) {
        Node newNode= new Node(arr[i]);
        current.next=newNode;;
        current= newNode;
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
    public static Node sortin01(Node head){
        return
    }
}
    
