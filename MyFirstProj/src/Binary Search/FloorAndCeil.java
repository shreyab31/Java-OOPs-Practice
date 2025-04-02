public class FloorAndCeil {
    static int floor(int a[], int n, int target){
        int low=0, high=n-1;
        int ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (a[mid]<=target) {
                ans=a[mid];
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    static int ceil(int a[], int n, int target){
        int low=0, high=n-1;
        int ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (a[mid]>=target) {
                ans=a[mid];
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
 public static void main(String[] args) {
    int a[]={3, 4, 4, 7, 8, 10};
    int n=a.length;
    int floor=floor(a, n, 5);
    int ceil=ceil(a, n, 5);
    System.out.println("Floor ="+floor+"  ceil="+ceil);
    
 }   
}
