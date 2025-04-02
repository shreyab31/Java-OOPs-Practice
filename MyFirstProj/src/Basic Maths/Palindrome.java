import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
        System.out.println("Enter num");        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); 
        int original=n;
        int reversed=0;
        while (n>0) {
            int lastdigit=n%10;
            n=n/10;
             reversed=reversed*10+lastdigit;
            System.out.print(lastdigit);
        }
        if (original==reversed) {
            System.out.println("Palindrome");
        }
        else System.out.println("Not palindrome");
        sc.close();
    } 
}
