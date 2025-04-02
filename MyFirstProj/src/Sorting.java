import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
               min=j;
            }    
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            }
         }
     public static void BubbleSort(int arr[], int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
     }
     public static void SelectionSortAgain(int arr[], int n, int start, int end){
        for(int i=0;i<n;i++){
            int last =arr.length-1;

        }
     }
     public static void InsertionSort(int arr[], int n){
        
     }
     public static void Merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right = mid+1;
        while (left<=mid && right<=high) {
            if (arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }
        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    public static void MergeSort(int arr[], int low, int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }
    public static int Partition(List<Integer> arr, int low, int high){
        int i=low;
        int j=high;
        int pivot= arr.get(low);
        while (i<j) {
            while (arr.get(i)<=pivot&&i<=high-1) {
            i++;
            }
        while(arr.get(j)>pivot&& j>=low+1){
            j--;
        }
        if (i<j) {
        int temp=arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
        }
    }
    int temp=arr.get(low);
    arr.set(low, arr.get(j));
    arr.set(j, temp);
    return j;
    }
     static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = Partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String[] args) {
        //int arr[]={4,6,2,5,7,9,1,3};
        //Selection(arr);
        //BubbleSort(arr, n);
        //MergeSort(arr, 0, n-1);
        List<Integer> arr = new ArrayList<>();  
        int n=arr.size();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        arr= (arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
    }
}
}