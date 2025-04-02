import java.util.*;
public class ElementSwapArr {
    public static void main(String[] args) {
int arr[]= new int[5];
 int i;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int n= Math.floorDiv(arr.length,2);
        int l=arr.length;
        int temp;
        // swap arr[i] and arr[a-l-i]
        for (i=0;i<n;i++){
            temp =arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element: arr){
            System.out.print(element +" ");
        }

        }
}
