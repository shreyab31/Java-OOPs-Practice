public class SearchAndInsert {
    static int searchIndex(int a[], int n, int x){
        int low=0, high=n-1;
        int ans=n;
        while (low<=high) {
           int mid=(low+high)/2;
           if (a[mid]>=x) {
            ans=mid;
            high=mid-1;
           } 
           else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7};
        int n =a.length;
        System.out.println(searchIndex(a, n, 6));
    }
}
