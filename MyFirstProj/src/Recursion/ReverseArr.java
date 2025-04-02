import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class ReverseArr {
    static int[] brute (int arr[]){
        int a[]= new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) {
            a[arr.length-i-1]=arr[i];
        }
        return a;
    }
    static int[] twoPtrsBetter(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
    static int[] recursive(int arr[], int start, int end){
        if(start>end) return arr;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return recursive(arr,start+1,end-1);
    }
    static Integer[] inbuilt(Integer arr[]){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        //int a[]=brute(arr);
        //int a[]=twoPtrsBetter(arr);
        /*int a[]=recursive(arr, 0, arr.length-1);
        for (int i : a) {
            System.out.print(i);
    }*/
    Integer a[] = inbuilt(arr);
    System.out.println(Arrays.toString(a));
        }
    }
