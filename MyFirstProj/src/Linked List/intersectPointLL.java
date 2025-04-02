import java.util.HashSet;

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
public class intersectPointLL {
    public static Node insertNode(Node head, int val){
        Node newNode= new Node(val);
        if (head==null) {
            head= newNode;
            return head;
        }
        Node current=head;
        while (current.next!=null) {
           current=current.next;
        }
        current.next= newNode;
            return head;
        }
    
    public static void printLL(Node head){
        Node current=head;
            while (current!=null) {
                System.out.print(current.data+"->");   
                current=current.next;
               }
               System.out.print("null");
        }
    
    public static Node bruteByHashing(Node head1, Node head2){
       HashSet<Node> st= new HashSet<>();
       while (head1!=null) {
        st.add(head1);
        head1=head1.next;
       }
       while (head2!=null) {
        if(st.contains(head2)) return head2;
        head2=head2.next;
       }
       return null;
    }
    public static Node intersectPointPresentOrNot(Node head1, Node head2){
        while (head2!=null) {
            Node temp=head1;
           while (temp!=null) {
                if (temp==head2)  return head2;
                temp=temp.next;
           } 
                 head2=head2.next;
            }
            return null;
        }
        public static int ByDifferenceofTwoLists(Node head1, Node head2){
            int len1=0, len2=0;
            while (head1!=null||head2!=null) {
                if (head1!=null) {
                    len1=len1+1;
                    head1=head1.next;
                }
                if (head2!=null) {
                    len2=len2+1;
                    head2=head2.next;
                }
            }
                return len1-len2;
        }
    public static Node interesectionOrNotByDiff(Node head1, Node head2){
    int diff=ByDifferenceofTwoLists(head1, head2);
    if (diff<0) 
        while (diff++!=0) {
            head2=head2.next;
        }
        else while (diff--!=0) {
        head1= head1.next;        
        }
        while (head1!=null) {
            if (head1==head2) return head1;
            head1=head1.next;
            head2=head2.next;
        }
        return head1;
    }
    public static Node intersectionPresentByOptimal(Node head1, Node head2){
        Node demo1=head1;
        Node demo2=head2;
        while (demo1!=demo2) {
            demo1=demo1==null? head2:demo1.next;
            demo2=demo2==null? head1:demo2.next;
        }
        return demo1;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertNode(head, 1);
        head=insertNode(head, 3);
        head=insertNode(head, 1);
        head=insertNode(head, 2);
        head=insertNode(head, 4);
        Node head1=head;
        head=head.next.next.next;
        Node headsec=null;
        headsec=insertNode(headsec, 3);
        Node head2 =headsec;
        headsec.next=head;
        System.out.println("\nList1: "); 
        printLL(head1);
        System.out.println("\nList2: "); 
        printLL(head2);
        //System.out.println(("\nintersecting point: ")+bruteByHashing(head1, head2).data);
        //Node answerNode = intersectPointPresentOrNot(head1,head2);
        //Node answerNode= interesectionOrNotByDiff(head1, head2);
        Node answerNode=intersectionPresentByOptimal(head1, head2);
        if(answerNode == null)  
        System.out.println("\nNo intersection\n");
        else
        System.out.println("\nThe intersection point is "+answerNode.data);
    }
}
