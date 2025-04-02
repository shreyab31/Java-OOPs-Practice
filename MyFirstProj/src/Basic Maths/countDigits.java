
import java.util.Scanner;

public class countDigits {
    public static int brute(int n){
        int count=0;
        while (n!=0) {
           n=n/10;
           count++;
            }
            return count;
        }
        public static int optimal(int n){
            int count= (int)(Math.log10(n))+1;
            return count;
        }
    public static void main(String[] args) {
    System.out.println("Enter num");        
    Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(brute(n));
        System.out.println(optimal(n));
        sc.close();
    }
}