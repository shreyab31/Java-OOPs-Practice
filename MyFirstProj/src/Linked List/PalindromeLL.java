import java.util.Stack;
class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL back;
    NodeDLL(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
    NodeDLL(int data, NodeDLL next, NodeDLL back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
}
public class PalindromeLL {
    public static NodeDLL convertArrToDLL(int arr[]){
        NodeDLL head= new NodeDLL(arr[0]);
        NodeDLL prev=head;
        for (int i=1; i < arr.length; i++) {
            NodeDLL newNode= new NodeDLL(arr[i], null, prev);
            prev.next=newNode;
            prev= newNode;
        }
        return head;
    }
    public static void printDLL(NodeDLL head){
        NodeDLL current=head;
        while (current!=null) {
            System.out.println(current.data+"-> ");
            current=current.next;
        }
        }
        public static boolean bruteByStack(NodeDLL head){
            Stack<Integer> st = new Stack<>();
            NodeDLL current=head;
            while (current!=null) {
                st.push(current.data);
                current=current.next;
            }
            current=head;
            while (current!=null) {
                if (current.data!=st.peek()) {
                    return false;
                }
                st.pop();
                current=current.next;
            }
            return true;
    }
    public static boolean optimalByptrs(NodeDLL head){
        NodeDLL back=head;
        NodeDLL front=head;
        while (back.next!=null) {
            back=back.next;
        }
            while (front != back && front.back!= back) {
                if (front.data!=back.data) {
                    return false;
                }
                front=front.next;
                back=back.back;
                }
                return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        NodeDLL head= convertArrToDLL(arr);
        //System.out.println(bruteByStack(head));
        System.out.println(optimalByptrs(head));
    }
}
