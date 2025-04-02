package Array;
import java.util.ArrayList;

public class MoveZeroesToEnd {
    static int[] brute(int arr[], int n){
        ArrayList<Integer> nonzero= new ArrayList<>();
        for (int i : arr) {
            if (i!=0) {
                nonzero.add(i);
            }
        }
        for (int i = 0; i < nonzero.size(); i++) {
            arr[i] = nonzero.get(i);
        }
        for (int i =  nonzero.size(); i < arr.length; i++) {
            arr[i]=0;
        }

        return arr;
    }
    static int[] optimalVS(int a[], int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
                }
    }
    for (int i = count; i < a.length; i++) {
        a[i]=0;
    }
    return a;
}
    static int[] optimal(int a[], int n){
        int j=-1;
       for (int i = 0; i < n; i++) {
        if (a[i]==0){ j=i;
        break;
       }
    }
       if (j==-1) return a;
       for (int i = j+1; i <n; i++) {
        if (a[i] != 0) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        j++;
       }
    }
return a;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int ans[]=optimal(arr, n);
        for (int i:ans){
            System.out.print(i);
        }
    }
}
