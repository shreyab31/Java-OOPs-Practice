package Array;

import java.util.HashMap;

public class LongestSubArr {
    static int brute3loops(int a[], int k){
        int n = a.length;
        int len=0;
        for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    int sum=0;
                    for (int K = i; K <=j; K++) {
                        sum+=a[K];
                    }
                    if(sum==k) len=Math.max(len, j-i+1);
                    }
                }
                return len;
        }
    static int brute2loops(int a[], int k){
        int n = a.length;
        int len=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
                for (int j = i; j < a.length; j++) {
                    sum+=a[j];
                    if(sum==k) len=Math.max(len, j-i+1);
                    }
                }
                return len;
        }
    static int better(int a[], int k){
        int n = a.length;
        int maxLen=0;
        int len=0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if (sum==k) {
                 maxLen=Math.max(len, i+1);
            }
            int rem=sum-k;
            if (preSum.containsKey(rem)) {
                 len=i-preSum.get(rem);
                maxLen=Math.max(maxLen, len);
    }
        if (!preSum.containsKey(sum)) {
            preSum.put(sum, i);
        }
    }
    return maxLen;
    }
    static int optimal(int a[], int k){
            int left=0, right=0;
            int n=a.length;
            int sum=a[0];
            int len=0;
            while (right<n) {
                if (left<right&&sum>k) {
                    sum-=a[left];
                    left++;
                }
                if (sum==k) {
                    len=Math.max(len, right-left+1);
                }
                right++;
                if (right < n) sum += a[right];
            }
            return len;
        }
        
  public static void main(String[] args) {
    int[] a = {2, 3, 5, 1, 9};
    System.out.println(better(a, 10));
  }  
}
