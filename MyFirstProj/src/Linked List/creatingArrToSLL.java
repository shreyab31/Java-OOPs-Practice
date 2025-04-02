class Node{
    int data;
    Node next;
    
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class creatingArrToSLL {
    Node head;
    public void convertArrToLL(int arr[]){       
        if (arr.length==0) {
            head=null;
            return;
        }
        head= new Node(arr[0]);
        Node current=head;
        for (int i=1; i < arr.length; i++) {
            Node newNode= new Node(arr[i]);
                current.next=newNode;
                current=newNode;
            }
        }
        public void PrintLL(){
            Node current=head;
            while (current!=null) {
                System.out.print(current.data+"-> ");
                current=current.next;
            }
            System.out.println("null");
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        creatingArrToSLL linkedList= new creatingArrToSLL();
        linkedList.convertArrToLL(arr);
        linkedList.PrintLL();
    }
}
