package Array;

import java.util.Arrays;

public class secondSmallestAndLargest {
    static int[] brute(int a[]){
        int n=a.length;
        Arrays.sort(a);
        return new int[]{a[1], a[n-2]};
    }  
    static int[] optimal(int a[]){
        int n=a.length;
        int max = Integer.MIN_VALUE, seclarge = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secmin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i]>max) {
                 seclarge=max;
                max=a[i];
            }
            if (a[i]<min) {
                 secmin=min;
                min=a[i];
            }
        }
        return new int[]{secmin, seclarge};
    }    
    public static void main(String[] args) {
        int a[]={4, 1, 5, 2, 3};
        int result[]=brute(a);
        System.out.println("smallest " +result[0]);
        System.out.println("largest "+result[1]);
        
}
}
