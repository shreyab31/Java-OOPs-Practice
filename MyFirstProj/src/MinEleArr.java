import java.util.Scanner;
public class MinEleArr {
public static void main(String[] args) {
    int a[]=new int[5];
    int min=a[0];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements of the array");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        if(a[i]<min){
            min=a[i];
        }
    }
    System.out.println("Minimum element of the array is: "+min);
}    
}
