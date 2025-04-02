package Array;

import java.util.HashMap;

public class CountSubArrWithGivenSum {
    static int bruteBy3loops(int a[], int n, int x){
        int count=0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n;j++) {
                int sum=0;
                for (int k=i; k<=j; k++) {
                    sum+=a[k];
                if (sum==x) {
                    count++;
                }
                }
            }
        }
        return count;
    }

    static int betterBy2loops(int a[], int n, int x){
        int count=0;
        for (int i=0; i<n; i++) {
            int sum=0;
            for (int j=i; j<n;j++) {
                sum+=a[j];
                if (sum==x) {
                    count++;
                }
            }
        }
        return count;
    }
    static int optimalByPrefixSum(int a[], int n, int x){
        HashMap<Integer, Integer> map= new HashMap<>();
        int preSum=0, count=0;
        map.put(0, 1);
        for (int i = 0; i<n; i++) {
            preSum+=a[i];
            int remove=preSum-x;
            count+=map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=a.length;
        //System.out.println(betterBy2loops(a, n, 3));
        //System.out.println(bruteBy3loops(a, n, 3));
        System.out.println(optimalByPrefixSum(a, n, 3));
    }
}
