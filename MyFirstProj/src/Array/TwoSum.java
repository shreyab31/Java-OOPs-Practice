package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    static String brute(int [] a, int k) {
        int ans[]= new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]+a[j]==k)
                {
                    ans[0]=a[i];
                    ans[1]=a[j];
                    return Arrays.toString(ans);
                }
            }
        }
        return null;
    }
    static String better(int a[], int k){
        HashSet<Integer> set = new HashSet();
        int ans[]= new int[2];
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
    }
    for (int i = 0; i < a.length; i++) {
        int remaining=k-a[i];
        if(set.contains(remaining)&& remaining != a[i])
        { ans[0]=a[i];
         ans[1]=remaining;
        return Arrays.toString(ans);
    }
    }
    return null;
    }
    static String optimal(int a[], int k){
        int ans[]= new int[2];
        int left=0, right=a.length-1;
        while (left<right) {
            int sum=a[left]+a[right];
            if (sum==k) {
                ans[0]=a[left];
                ans[1]=a[right];
                return Arrays.toString(ans);
                }
                else if (sum<k) left++;
                    else right--;
                }
                return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(optimal(nums, 18));
    }
}