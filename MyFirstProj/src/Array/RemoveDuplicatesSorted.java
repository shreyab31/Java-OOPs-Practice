package Array;

import java.util.HashSet;

public class RemoveDuplicatesSorted {
    static int[] brute(int arr[], int n) {
        int temp[]= new int [n];
        int j=0;
        for (int i = 0; i <n-1; i++) {
            if(arr[i]!=arr[i+1]) temp[j++] = arr[i];
        }
        temp[j++] = arr[n - 1];
        return temp;
    }
    static int[] bruteWith1SC(int arr[], int n) {
        int j=0;
        for (int i = 0; i <n-1; i++) {
            if(arr[i]!=arr[i+1]) arr[j++] = arr[i];
        }
        arr[j++] = arr[n - 1];
        while (j < n) {
            arr[j++] = 0;
        }
        return arr;
    }
    static int bruteByHashset(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int j = 0;
        int k=set.size();
        for (int x: set) {
            arr[j++] = x;
        }
        while (j < n) {
            arr[j++] = 0;
        }
        return k;
    }
    static int optimal2ptrs(int a[], int n){
        int i=0;
        for (int j = 1; j < a.length; j++) {
            if (a[i]!=a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3};
       //a= brute(a, a.length);
       //a=bruteWith1SC(a, a.length);
       //System.out.println("unique elements "+bruteByHashset(a, a.length));
       System.out.println(optimal2ptrs(a, a.length));
        for (int i : a) {
            System.out.print(i);
        }
    }
}
