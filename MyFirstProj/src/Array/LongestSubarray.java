package Array;

import java.util.HashMap;


public class LongestSubarray {
    static int bruteBy3loops(int a[], int n, int x){
        int length=0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int sum=0;
                for (int k=i; k<=j; k++) {
                    sum+=a[k];
                }
                if(sum==x){
                    length=Math.max(length, j-i+1);
                }
            }
        }
            return length;
    }
    static int bruteBy2loops(int a[], int n, int x){
        int length=0;
        for (int i=0; i<n; i++) {
            int sum=0;
            for (int j=i; j<n; j++) {
                    sum+=a[j];
                if(sum==x){
                    length=Math.max(length, j-i+1);
                }
            }
        }
            return length;
    }
    static int betterbyHashMap(int a[], int n, int x){
        HashMap<Long,Integer> preSumMap= new HashMap<>();
        long sum=0;
        int maxLength=0;
        for (int i=0; i<n; i++) {
            sum+=a[i];
            if (sum==x) {
                maxLength=Math.max(maxLength, i+1);
            }
            long rem=sum-x;
            if(preSumMap.containsKey(rem)){
                int length=i-preSumMap.get(rem);
                maxLength=Math.max(maxLength, length);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLength;
    }
    static int optimalBy2Pointers(int a[], int n, int x){
        int left=0, right=0;
        int sum=a[0];
        int maxLength=0;
        while (right<n) {
            while (left<=right&&sum>x) {
                sum-=a[left];
                left++;
            }
            if (sum==x) {
                maxLength=Math.max(maxLength, right-left+1);
            }
            right++;
            if(right<n)sum+=a[right];
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int a[]={2, 3, 5, 1, 9};
        int n=a.length;
        //System.out.println(bruteBy3loops(a, n, 10));
        //System.out.println(bruteBy2loops(a, n, 10));
        //System.out.println(betterbyHashMap(a, n, 10));
        System.out.println(optimalBy2Pointers(a, n, 10));
    }
}
