import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {
    static int partition( List<Integer> a, int low, int high){
        int i=low;
        int j=high;
        int pivot=a.get(low);
        while (i<j) {
            while (a.get(i)<=pivot && i<=high-1) i++;
            while (a.get(j)>pivot && j>=low+1) j--;
            if (i < j) {
                int temp=a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
            }
        }
        int temp=a.get(low);
        a.set(low,a.get(j));
        a.set(j, temp);
        return j;
    }
    static void qs( List<Integer> a, int low, int high){
        if(low<high){
            int pindex=partition(a, low, high);
            qs(a, low, pindex-1);
            qs(a, pindex+1, high);
        }
    }
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a=Arrays.asList(new Integer[]{4,3,2,5,7,9,1,3});
        qs(a,0,a.size()-1);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}