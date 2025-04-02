import java.util.Scanner;
public class SumFloatArr {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    float arr[] = new float[size];
    float sum=0f, n;
    int i;
    System.out.println("Enter the array elements");
    for( i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextFloat();
        sum=sum+arr[i];
    }
    System.out.println("sum= "+sum);
 }    
}
