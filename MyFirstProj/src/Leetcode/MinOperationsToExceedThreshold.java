import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinOperationsToExceedThreshold {
    static int minOperations(int arr[], int k){
        ArrayList<Integer> list= new ArrayList<>();
        if (arr.length<1) return 0;
        for (int nums : arr) {
            list.add(nums);
        }
        int operations=0;
        while (true) {
            Collections.sort(list);
            if (list.get(0)>=k) break;
            int el=Math.min(list.get(0), list.get(1))*2+Math.max(list.get(0), list.get(1));
            list.remove(0);
            list.remove(0);
            list.add(el);
            operations++;
    }
    return operations;
    }
 public static void main(String[] args) {
    int[] arr = {1,1,2,4,9};
    System.out.println(minOperations(arr, 20));

 }
    
}