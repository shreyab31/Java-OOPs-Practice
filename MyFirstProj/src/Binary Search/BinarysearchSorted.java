 class BinarySearchSorted{
    static int binarySearch(int a[], int n, int target){
        int low=0, high=n-1;

        while (low<=high) {
            int mid= (low+high)/2;
            if (a[mid]==target) return mid;           
            else if (target>a[mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    } 
    static int Recursion(int a[], int low, int high, int target){
        int mid= (low+high)/2;
        if (low>high) return -1;
        if (a[mid]==target) return mid;
        else if (target>a[mid]) {
            return Recursion(a, mid+1, high, target);
        }
        else return Recursion(a, low, mid-1, target);
    }
    static int Search(int a[], int n, int target){
        return Recursion(a, 0, n-1, target);
    }
    public static void main(String[] args) {
        int a[]={3, 4, 6, 7, 9, 12, 16, 17};
        int n=a.length;
        //System.out.println(Search(a, n, 6));
        System.out.println(binarySearch(a, n, 6));
    }
}