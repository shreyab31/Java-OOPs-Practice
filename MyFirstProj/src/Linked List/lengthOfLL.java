class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1; 
        this.next=null;
    }
}
public class lengthOfLL {
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
    public static int length(Node head){
        Node current=head;
        int count=0;
        while (current!=null) {
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head= new Node(arr[0]);
        System.out.println(length(head));
    }    
}
