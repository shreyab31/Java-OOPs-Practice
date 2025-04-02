class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public class searchingElementLL {
        public static void convertArrToLL(int arr[], Node head){
            if (arr.length==0) {
                head=null;
                return;
            }
            Node current=head;
            for(int i=1;i<arr.length;i++){
                Node newNode= new Node(arr[i]);
                current.next=newNode;
                current=newNode;
            }
        }
        public static int checkIfPresent(Node head, int key){
            Node current=head;
            while (current!=null) {
                if (current.data==key) {
                    return 1;
                }
                current=current.next;
            }
            return 0;
        }
    public static void main(String[] args) {
        int arr[]={12,43,55,45,76};
        Node head= new Node(arr[0]);
        convertArrToLL(arr, head);
        if(checkIfPresent(head, 45)==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
