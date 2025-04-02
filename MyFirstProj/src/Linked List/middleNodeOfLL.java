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
public class middleNodeOfLL {
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
    
    public static Node middleIfEven(Node head, int mid) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == mid + 1) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static Node middleIfOdd(Node head, int mid) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == mid) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public static Node bruteOfStriv(Node head){
        if (head==null||head.next==null) {
            return head;
        }
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        int mid=(count/2)+1;
        temp=head;
        while (temp!=null) {
            mid=mid-1;
            if (mid==0) {
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    public static Node TortoiseAndHarre(Node head){
        Node slow=head, fast=head;
        while (fast!=null && fast.next!=null &&slow.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
     int arr[]={2,3,1,4,5};
    Node head= convertArrToLL(arr);   
    /*int mid=arr.length/2;
    if (mid%2==0) {
     System.out.println(middleIfEven(head,mid).data);    
    } 
    else{
    System.out.println(middleIfOdd(head,mid).data);
    }*/

    System.out.println(bruteOfStriv(head).data);
    //System.out.println(TortoiseAndHarre(head).data);
    }
    }
    