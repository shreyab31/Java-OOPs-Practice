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
public class creatingArrToDLL {
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
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        NodeDLL head= converArrToDll(arr);
        printDLL(head);
    }
}
