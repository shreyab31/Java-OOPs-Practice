import java.util.Arrays;
public class FirstAndLastOccurence {
    static void LinearSearch(int a[], int n, int x){
        int first=-1, last=-1;
        for (int i=0; i<n; i++) {
            if (a[i]==x) {
                if (first==-1) {
                    first=i;
                }
                last=i;
            }
        }
        System.out.println("first ="+first);
        System.out.println("Last="+last);
    }
    static int lowerBound(int a[], int n, int x){
        int low=0, high=n-1;
        int ans=n;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (a[mid]>=x) {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int upperBound(int a[], int n, int x){
        int low=0, high=n-1;
        int ans=n;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (a[mid]>x) {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int[] firstandlast(int a[], int n, int x){
        int lb= lowerBound(a, n, x);
        if (lb==n|| a[lb]!=x) return new int[] {-1,-1};
        return new int[] {lb, upperBound(a, n, x)-1};
        }
        static int FirstOccurenceBinarySearch(int a[], int n, int x){
            int low=0, high=n-1, first=-1;
            while (low<=high) {
                int mid=low+(high-low)/2;
                if (a[mid]==x) {
                    first=mid;
                    high=mid-1;
                }
                else if (a[mid]<x) {
                    low=mid+1;
                }
                else high=mid-1;
            }
            return first;
        }
        static int LastOccurenceBinarySearch(int a[], int n, int x){
            int low=0, high=n-1, last=-1;
            while (low<=high) {
                int mid=low+(high-low)/2;
                if (a[mid]==x) {
                    last=mid;
                    low=mid+1;
                }
                else if (a[mid]<x) {
                    low=mid+1;
                }
                else high=mid-1;
            }
            return last;
        }
        static int[] firstandlastBS(int a[], int n, int x){
            int first=FirstOccurenceBinarySearch(a, n, x);
            if (first==-1) return new int[]{-1,-1};
            int last=LastOccurenceBinarySearch(a, n, x);
            return new int[]{first,last};
        }
    public static void main(String[] args) {
        int a[] = {3,4,13,13,13,20,40};
        int n=a.length;
        //LinearSearch(a, n, 7);
        //System.out.println(Arrays.toString(firstandlast(a, n, 13)));
        System.out.println(Arrays.toString(firstandlastBS(a, n, 13)));
    }
}
