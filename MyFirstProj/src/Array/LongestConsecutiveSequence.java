package Array;
import java.util.Arrays;
import java.util.HashSet;
public class LongestConsecutiveSequence {
    static int Brute(int a[], int n){
        int num;
        int seq=0;
        for(int i=0;i<n;i++){
                num=a[i];
                seq=1;
            for (int j=0; j<n; j++) {
                if (num+1==a[j]) {
                    seq++;
                    num++;
                    j=0;
                }
            }
        }
        return seq;
    }
    static int BruteStriv(int a[], int n){
        int longest=1;
        for (int i=0; i<n; i++) {
            int num=a[i];
            int count=1;
            while (linearSearch(a, num+1)==true) {
                num+=1;
                count+=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    static boolean linearSearch(int a[], int num) {
        for (int i=0; i<a.length; i++) {
            if (a[i]==num) {
                return true;
            }
        }
        return false;
    }
    static int Better(int a[], int n){
        if (n==0) return 0;
        Arrays.sort(a);
        int lastSmaller=Integer.MIN_VALUE;
        int count=1, longest=1;
        System.out.println(Arrays.toString(a));   
        for (int i=0; i<n; i++) {
            if (a[i]-1==lastSmaller) {
                count++;
                lastSmaller=a[i];
            }
            else if (a[i]-1!=lastSmaller){
                count=1;
                lastSmaller=a[i];
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
    static int OptimalByHashset(int a[], int n){
        if (n==0) return 0;
        int longest=1;
        HashSet<Integer> set= new HashSet<>();
        for (int i=0; i<n; i++) {
            set.add(a[i]);
        }
        for (int it: set) {
            if (!set.contains(it-1)) {
                int num=it;
                int count=1;
                while (set.contains(num+1)) {
                    count++;
                    num+=1;
                }
                longest=Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int a[]={104,103,102,100,1,101,3,2,1,1};
        int n=a.length;
        //System.out.println(Brute(a, n));
        //System.out.println(BruteStriv(a, n));
        //System.out.println(Better(a, n));
        System.out.println(OptimalByHashset(a, n));
    }
}
