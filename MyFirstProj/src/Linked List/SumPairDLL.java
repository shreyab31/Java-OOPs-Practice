import java.util.ArrayList;
import java.util.List;

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
public class SumPairDLL {
    public static NodeDLL convertArrToLL(int arr[]){
        NodeDLL head= new NodeDLL(arr[0]);
        NodeDLL prev=head;
        for (int i = 1; i < arr.length; i++) {
            NodeDLL newNode= new NodeDLL(arr[i], null, prev);
            prev.next=newNode;
            prev=newNode;
        }
        return head;
    }
    public static List<NodeDLL[]> brute(NodeDLL head, int sum){
        List<NodeDLL[]> pairs = new ArrayList<>();
        NodeDLL first=head;
        while (first!=null) {
            NodeDLL second=first.next;
            while (second!=null) {
             
            if (first.data+second.data>sum) break;
            if (first.data+second.data==sum) {
                pairs.add(new NodeDLL[] { first, second }); 
            }
            second=second.next;
        }
        first=first.next;
    }
    return pairs;
}   
    public static List<int[]> optimal(NodeDLL head, int sum){
        List<int[]> pairs= new ArrayList<>();
        NodeDLL left=head;
        NodeDLL right=head;
        while (right.next!=null) {
            right=right.next;
        }
        while (left.data<right.data) {
            if (left.data+right.data==sum) {
                pairs.add(new int[]{left.data, right.data});
                left=left.next;
                right=right.back;
            }   
            else if (left.data+right.data>sum) {
                right=right.back;
            }
            else{
                left=left.next;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9};
        NodeDLL head=convertArrToLL(arr);
       /* List<NodeDLL[]> pairs = brute(head, 5);
        if (!pairs.isEmpty()) {
            for (NodeDLL[] pair : pairs) {
                System.out.println("("+pair[0].data + "," + pair[1].data + ")");
            }
        } else {
            System.out.println("No pair found.");
        }*/
        List<int[]> optimalPairs = optimal(head, 5);
        for (int ans[]:optimalPairs) {
            System.out.println(ans[0]+","+ans[1]);
        }
    }        
    }
