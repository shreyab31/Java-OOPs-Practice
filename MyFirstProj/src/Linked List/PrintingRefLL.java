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
public class PrintingRefLL {
    public static void main(String[] args) {
        
    int a[]={2,4,6,8};
    Node x= new Node(a[0]);
    Node y=x;
    System.out.println(y.next);
    }
} 
