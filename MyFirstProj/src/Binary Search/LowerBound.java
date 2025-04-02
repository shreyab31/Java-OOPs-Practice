public class LowerBound {
    static int brute(int a[], int n, int target){
        for (int i=0; i<n; i++) {
            if (a[i]>=target) {
                return i;
            }
        }
        return n;
    }
    static int optimal(int a[], int n, int target){
        int low=0, high=n-1;
        int ans=n;
        while (low<=high) {
            int mid=(low+high)/2;
            if (a[mid]>=target) {
               ans=mid;
               high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={3, 5, 8, 15, 19};
        int n=a.length;
        //System.out.println(brute(a, n, 9));
        System.out.println(optimal(a, n, 9));
    }
}
