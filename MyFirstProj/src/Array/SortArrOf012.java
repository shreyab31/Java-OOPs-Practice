package Array;
import java.util.Arrays;
import java.util.ArrayList;

public class SortArrOf012 {
    static int[] BruteBySortFunc(int a[], int n){
        Arrays.sort(a);
        return a;
    }
    static ArrayList<Integer> BetterBy3Counts(int a[], int n){
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0; i<n; i++) {
            if(a[i]==0) count0++;
            else if (a[i]==1) count1++;
            else if (a[i]==2) count2++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<count0; i++) list.add(0);
        for (int i=0; i<count1; i++) list.add(1);
        for (int i=0; i<count2; i++) list.add(2);
        return list;
    }   
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static int[] DutchNationalFlagAlgo(int a[], int n){
        int mid=0;
        int high=n-1;
        int low=0;
        while (mid<=high) {
            if (a[mid]==0) {
                swap(a,low,mid);
                low++;
                mid++;
            }
            else if (a[mid]==1) {
                mid++;
            }
            else if (a[mid]==2) {
                swap(a,mid,high);
                high--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={0,1,1,0,1,2,1,2,0,0,0};
        int n=a.length;
        //System.out.println(Arrays.toString(BruteBySortFunc(a, n)));
        //System.out.println(BetterBy3Counts(a, n));
        System.out.println(Arrays.toString(DutchNationalFlagAlgo(a, n)));
    }
    
}