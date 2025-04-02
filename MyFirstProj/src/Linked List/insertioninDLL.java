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
public class insertioninDLL {
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
    public static NodeDLL insertHead(NodeDLL head, int el){
        NodeDLL newNode=new NodeDLL(el);
        newNode.next=head;
        head.back=newNode;
        head=head.back;
        return head;
    }
    public static NodeDLL insertHead2(NodeDLL head, int el){
        NodeDLL newNode=new NodeDLL(el,head,null);
        head.back=newNode;
        head=head.back;
        return head;
    }
    public static NodeDLL insertTail(NodeDLL head, int el){
        NodeDLL current=head;
        while (current.next!=null) {
            current=current.next;
        }
        NodeDLL newNode= new NodeDLL(el,null,current);
        current.next=newNode;
        return head;
    }
    public static NodeDLL insertBeforeTail(NodeDLL head, int el){
        NodeDLL current=head;
        while (current.next.next!=null) {
            current=current.next;
        }
        NodeDLL newNode= new NodeDLL(el,current.next,current);
        current.next=newNode;
        return head;
    }
    public static NodeDLL insertBeforeTailStriv(NodeDLL head, int el){
        NodeDLL current=head;
        while (current.next!=null) {
            current=current.next;
        }
        NodeDLL prev=current.back;
        NodeDLL newNode= new NodeDLL(el,current,prev);
        prev.next=newNode;
        current.back=newNode;
        return head;
    }
    public static NodeDLL insertBeforeKNode(NodeDLL head, int k, int el){
        if (head==null) {
            return head;
        }
        if (k==1) {
            return insertHead(head, 1);
        }
        NodeDLL current=head;
        int count=0;
        while (current.next!=null) {
            count++;
            if(k==count) break;
           current=current.next;
        }
        NodeDLL prev=current.back;
        NodeDLL newNode = new NodeDLL(el, current, prev);
        prev.next=newNode;

        return head;
    }
    public static void insertBeforeGivenNode(NodeDLL current, int el){
        NodeDLL prev=current.back;
        NodeDLL newNode= new NodeDLL(el, current, prev);
        prev.next=newNode;
        current.back=newNode;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        NodeDLL head= converArrToDll(arr);
        //head=insertHead(head, 1);
        //head=insertHead2(head, 1);
        //head=insertTail(head, 1);
        //head=insertBeforeTail(head, 1);
        //head=insertBeforeTailStriv(head, 1);
        //head=insertBeforeKNode(head, 6, 1);
        insertBeforeGivenNode(head.next.next.next.back.back, 1);
        printDLL(head);
    }
}
