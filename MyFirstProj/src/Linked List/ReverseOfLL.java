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
 public class ReverseOfLL {
    public static NodeDLL converArrToDll(int arr[]){
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
    public static NodeDLL bruteByStack(NodeDLL head){
        Stack<Integer> st = new Stack<>();
        NodeDLL temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            temp.data=st.pop();
            temp=temp.next;
        }
        return head;
    }
    public static NodeDLL optimalByChangingLinks(NodeDLL head){
        NodeDLL temp = head;    
        NodeDLL prev = null;  
        while(temp != null){  

            NodeDLL front = temp.next;  
            temp.next = prev;  
            prev = temp;  
            temp = front; 
        }
        
        return prev;  
     
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        NodeDLL head = converArrToDll(arr);
        System.out.println("Doubly linked list before");
        printDLL(head);
        System.out.println("\nDoubly linked list after reversing");
        head=optimalByChangingLinks(head);
        printDLL(head);
    }
}
