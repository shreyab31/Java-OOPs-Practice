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
    public class deleteOccurenceinDLL {
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
        public static NodeDLL deleteOcc(NodeDLL head, int key){
            NodeDLL temp=head;
            while (temp!=null) {
                if (temp.data==key) {
                    if (temp==head) {
                        head=head.next;
                        if (head!=null) head.back=null;
                        temp=head;
                    }
                    else{
                        temp.back.next=temp.next;
                        if (temp.next!=null) {
                            temp.next.back=temp.back;   
                        }
                    }
                }
                temp=temp.next;
            }
            return head;
        }
    public static void main(String[] args) {
        int arr[]={1,4,10,10,6,10};
        NodeDLL head = convertArrToDll(arr); 
        NodeDLL answerNode=deleteOcc(head, 10);
        printDLL(answerNode);
    }   
}
