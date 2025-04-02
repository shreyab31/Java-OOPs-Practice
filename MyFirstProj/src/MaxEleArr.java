import java.util.Scanner;
public class MaxEleArr {
   public static void main(String[] args) {
    int a[]= new int[5];
    int max=a[0];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<a.length;i++){
       a[i]=sc.nextInt();
       if(a[i]>max)
       {
        max=a[i];
       }
    }
    System.out.println("Max element in the array is: "+max);
   } 
}
