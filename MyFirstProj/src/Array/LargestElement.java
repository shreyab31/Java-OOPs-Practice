package Array;
import java.util.Arrays;
public class LargestElement {
    static int brute(int a[]){
        Arrays.sort(a);
        return a[a.length-1];
    }
    static int optimal(int a[]){
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {2,5,4,2,8,2,1,3,2,1};
        System.out.println(brute(a));
        System.out.println(optimal(a));
    }

}
