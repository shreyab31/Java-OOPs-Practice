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
public class insertionInSLL {
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
public static void PrintLL(Node head){
    Node current=head;
    while (current!=null) {
     System.out.print(current.data+"->");   
     current=current.next;
    }
    System.out.print("null");
    }
    public static Node insertingHead(Node head){
        Node newNode= new Node(1);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static Node insertingHeadEasy(int val,Node head){
        return new Node(val,head);
    }
    public static Node insertingTailNode(Node head){
        Node newNode= new Node(1);
        Node current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newNode;
        current=newNode;
        return head;
    }
    public static Node insertingAtKPos(Node head, int k, int arr[]){
        Node newNode= new Node(1);
        if (k==1) {
            return insertingHead(head);
        }
        else if (k>arr.length) {
            return insertingTailNode(head);
        }
        else  {
            int count=1;
            Node current=head;
            Node prev=null;
            while (current!=null) {
                if (count==k) {
                prev.next=newNode;
                newNode.next=current;
                break;
                }
                count++;
                prev=current;
                current=current.next;
            }
        }
        return head;
        }
        public static Node insertingAtKPosStriv(Node head, int k, int val){
            int count=0;
            if (head==null) {
                if (k==1) {
                return null;
            }
            else return head;
        }
            Node temp=head;
            if (k==1) {
                return insertingHeadEasy(val, head);
            }
            while (temp!=null) {
                count++;
                if (count==k-1) {
                Node newNode= new Node(k);
                newNode.next=temp.next;
                temp.next=newNode;
                }
                temp=temp.next;
            }
            return head;
        }
        public static Node insertingBeforeVal(Node head, int val, int k){
            if (head==null) {
             return null;
        }   
        if (head.data==k) {
            return new Node(val,head);
        }   
        boolean found=false;
            Node temp=head;
            while (temp.next!=null) {
                if (temp.next.data==k) {
                Node newNode= new Node(val,temp.next);
                temp.next=newNode;
                found=true;
                break;
                }
                temp=temp.next;
            }
            if (found==false) {
                System.out.println("Not found");
            }
            return head;
        }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        Node head = convertArrToLL(arr);
        //head= insertingHead(head);
        //head=insertingHeadEasy(100, head);
        //head= insertingTailNode(head);
        //head=insertingAtKPos(head, 5, arr);
        //head=insertingAtKPosStriv(head, 1,1);
        head=insertingBeforeVal(head, 1, 14);
        PrintLL(head);
    }
}
