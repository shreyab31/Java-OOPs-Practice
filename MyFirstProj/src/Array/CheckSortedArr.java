package Array;
public class CheckSortedArr {
    static boolean brute(int a[]){
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) return false;
            }
        }
        return true;
    }
    static boolean optimal(int a[]){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
                if (a[i]>a[i+1]) return false;
        }
        return true;
    }
 public static void main(String[] args) {
    int arr[] = {1,1,2,2,3};
    System.out.println(brute(arr));
    System.out.println(optimal(arr));

 }    
}
