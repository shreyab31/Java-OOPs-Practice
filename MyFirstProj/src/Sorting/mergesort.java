import java.util.ArrayList;

public class mergesort {
   static void merge(int a[], int low, int mid, int high) {
      ArrayList<Integer> ls= new ArrayList<>();
      int left= low;
      int right=mid+1;
      while (left<=mid&&right<=high) {
         if (a[left]<=a[right]) {
            ls.add(a[left]);
            left++;
         }
        else {
            ls.add(a[right]);
            right++;
         }
      }
      while (left<=mid) { //if elements left
         ls.add(a[left]);
         left++;
      }
      while (right<=high) { //if elements left
         ls.add(a[right]);
         right++;
      }
      for (int i=low;i<=high;i++) {
         a[i]=ls.get(i-low);
      }
   }
   static void mergeSort(int a[], int low, int high){
      if (low>=high) return;
       int mid=(low+high)/2;
       mergeSort(a, low, mid);
       mergeSort(a, mid+1, high);
       merge(a, low, mid, high);
   }
   public static void main(String[] args) {
      int a[] = { 9, 4, 7, 6, 3, 1, 5 };
      mergeSort(a, 0, a.length-1);
      for (int i : a) {
         System.out.print(i);
      }
   }
}
