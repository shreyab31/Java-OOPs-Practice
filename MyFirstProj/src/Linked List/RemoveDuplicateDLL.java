
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
    public class RemoveDuplicateDLL {
        public static NodeDLL convertArrToDll(int arr[]){
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
        public static NodeDLL MyApproach(NodeDLL head){
            NodeDLL temp1=head;
            NodeDLL temp2=head.next; 
            while (temp2!=null) {
                if (temp2.next==null) temp1.next=null;
                if (temp1.data!=temp2.data) {
                    temp1.next=temp2;
                    temp2.back=temp1;
                    temp1=temp2;
                }
                temp2=temp2.next;
            }
            return head;
        }
        public static NodeDLL Striv(NodeDLL head){
            NodeDLL temp=head;
            while (temp.next!=null&&temp!=null) {
                NodeDLL nextNode=temp.next;
                while (nextNode!=null&&nextNode.data==temp.data) {
                    nextNode=nextNode.next;
                }
                temp.next=nextNode;
            }
            return head;
        }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,4,4,4};
        NodeDLL head = convertArrToDll(arr);
       //head= MyApproach(head);;
       head=Striv(head);
       printDLL(head);

    }
}
