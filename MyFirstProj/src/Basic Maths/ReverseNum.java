import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter num");        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); 
        while (n>0) {
            int lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit);
        }
        sc.close();
    }
}
