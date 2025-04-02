import java.util.ArrayList;
import java.util.Stack;

class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL back;

    NodeDLL(int data, NodeDLL next, NodeDLL back){
        this.data=data;
        this.next=next;
        this.back=back;
    }

    NodeDLL(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class OddAndEvenSeggregate {
    public static NodeDLL convertArrToDLL(int arr[]){
        NodeDLL head= new NodeDLL(arr[0]);
        NodeDLL prev=head;
        for(int i=1; i<arr.length; i++){
        NodeDLL newNode= new NodeDLL(arr[i], null, prev);
        prev.next=newNode;
        prev=newNode;
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
    public static NodeDLL brute (NodeDLL head){
        int count=1;
        NodeDLL current=head;
        NodeDLL temp;
        Stack<Integer> st = new Stack<>();
        while (current.next!=null) {
        current=current.next;
        }
        temp=current;
        while (current!=null) {
            if (count%2!=0) {
                st.push(current.data);
            }
                count++;
                current = current.back;
            }
            current = temp; 
            count = 1;
        while (current!=null) {
            if (count%2==0) {
                st.push(current.data);
            }
                count++;
                current=current.back;
        }
        current=head;
        while (current!=null&& !st.isEmpty()) {
            current.data=st.pop();
            current=current.next;
        }
        return head;
    }
    public static NodeDLL bruteByArrStriv (NodeDLL head){
        NodeDLL temp=head;
        ArrayList<Integer> OddEven= new ArrayList<>();
        while (temp!=null&&temp.next!=null) {
            OddEven.add(temp.data);
            temp=temp.next.next;
        }
        if (temp!=null) OddEven.add(temp.data);
        temp=head.next;
        while (temp!=null&&temp.next!=null) {
            OddEven.add(temp.data);
            temp=temp.next.next;
        }
        if (temp!=null) OddEven.add(temp.data);
        int i=0;
        temp=head;
        while (temp!=null) {
            temp.data=OddEven.get(i);
            i++;
            temp=temp.next;
        }
        return head;   
        }
        public static NodeDLL Optimal(NodeDLL head){
            NodeDLL odd=head;
            NodeDLL even=head.next;
            NodeDLL evenHead=head.next;
            while (even!=null&&even.next!=null) {
                odd.next=odd.next.next;
                odd=odd.next;
                even.next=even.next.next;
                even=even.next;
            }
            odd.next=evenHead; 
            return head;
        }
    public static void main(String[] args) {
        int arr[]={2, 3, 1, 4, 5, 6};
        NodeDLL head = convertArrToDLL(arr);
        //brute(head);
        //bruteByArrStriv(head);
        Optimal(head);
        printDLL(head);

    }
}
