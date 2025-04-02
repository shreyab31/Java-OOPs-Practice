import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }

    Node(int data, Node next, Node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
}
public class SortLL {
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
    public static void PrintLL(Node head){
        Node current=head;
        while (current!=null) {
        System.out.print(current.data+"->");   
        current=current.next;
    }
        System.out.print("null");
    }
    public static Node Sort(Node head){
        Node current=head;
        ArrayList<Integer> sortList= new ArrayList<>();
        while (current!=null) {
            sortList.add(current.data);
            current=current.next;
        }
        Collections.sort(sortList);
        current=head;
        int i=0;
        while (current!=null) {
            current.data=sortList.get(i++);
            current=current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        Node head = createArrToLL(arr);

        System.out.print("Original Linked List: ");
        PrintLL(head);

        head = Sort(head);
        System.out.print("\nSorted Linked List: ");
        PrintLL(head);
    
    }
}

