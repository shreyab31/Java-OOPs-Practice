import java.util.Scanner;

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
public class deletioninSLL {
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
    public static Node deleteheaNode(Node head){
        if (head==null) return head;
        head=head.next;
        return head;
    }
    public static void PrintLL(Node head){
        Node current=head;
        while (current!=null) {
         System.out.print(current.data+"->");   
         current=current.next;
        }
        System.out.print("null");
    }
    public static Node deleteTail(Node head){
        if (head==null||head.next==null) {
            return null;
        }
        Node current=head;
        while (current.next.next!=null) {
            current=current.next;
        }
        current.next=null;
        return head;
    }
    public static Node deleteKnode(Node head, int k, int arr[]){
        if (k==1) {
            return deleteheaNode(head);
        }
        else if (k==arr.length) {
            return deleteTail(head);
        }
        else{
            int count=0;
            Node current=head;
            Node prev=null;
            while (current!=null) {
                count++;
                if (count==k) {
                    prev.next=prev.next.next;
                    break;
                }
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
    public static Node deleteVal(Node head, int val){
        if (val==head.data) {
            return deleteheaNode(head);
        }
        else{
            Node current=head;
            Node prev=null;
            while (current!=null) {
                if (current.data==val) {
                    prev.next=prev.next.next;
                    break;
                }
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
    public static Node deleteValEasy(Node head, int val){
        Node current=head;
        while (current!=null) {
            current.data=current.next.data;
            current.next=current.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        Node head = convertArrToLL(arr);
        /*System.out.println("deleting head");
        head=deleteheaNode(head);
        PrintLL(head);*/

        /*System.out.println("Deleting tail");
        head=deleteTail(head);
        PrintLL(head);*/

        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter the value of k");
         int k=sc.nextInt();
        System.out.println("Deleting "+k+"th element");
        head=deleteKnode(head,k,arr);
        PrintLL(head);*/

        System.out.println("Enter the value");
        int val=sc.nextInt();
        head=deleteVal(head,val);
        PrintLL(head);
        sc.close();
}
}