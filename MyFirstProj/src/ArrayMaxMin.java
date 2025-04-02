import java.util.Scanner;
class Array{
    public int Max(int arr[]){
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large; 
    }
    public int Min(int arr[]){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
}
public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array elements");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Array a= new Array();
        int large=a.Max(arr);
        int small=a.Min(arr);
        System.out.println("Largest element: "+large);
        System.out.println("Smallest element: "+small);
        }
}
