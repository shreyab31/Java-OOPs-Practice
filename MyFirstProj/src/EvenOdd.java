import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the num to determine whether the number is even or odd");
    num=sc.nextInt();
    if(num%2==0)
    {
        System.out.println("Even");
    }
    if (num%2!=0) 
    {
    System.out.println("odd");    
 }
 sc.close();
}
}