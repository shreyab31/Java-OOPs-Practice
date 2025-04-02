package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sort012 {
    static void bruteMergeSort(int a[], int low, int high){
        if (low>=high) return;
        int mid=(low+high)/2;
        bruteMergeSort(a, low, mid);
        bruteMergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    static void merge(int a[], int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid&&right<=high) {
            if (a[left]<=a[right]) {
                temp.add(a[left]);
                left++;
            }
            else {
                temp.add(a[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(a[left]);
            left++;
        }
        while (right<=high) {
            temp.add(a[right]);
            right++;
        }
        for (int i = low; i <=high; i++) {
            a[i]=temp.get(i-low);
        }
    }
    static int[] better(int a[]){
        int n=a.length;
        int count0=0, count1=0, count2=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0) {
                count0++;
            }
            else if (a[i]==1) {
                count1++;
            }
            else if (a[i]==2) {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) a[i]=0;
        for (int i = count0; i < count0+count1; i++) a[i]=1;
        for (int i = count0+count1; i < n; i++) a[i]=2;
        return a;
    }
    static int[] optimal(int a[]){
        int low=0, mid=0, high=a.length-1;
       
        while (mid<=high) {
            if (a[mid]==0) {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            if (a[mid]==1) mid++;
            else {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,0,2,1,0,2,1,0 };
        optimal(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
