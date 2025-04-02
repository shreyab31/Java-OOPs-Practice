import java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to print in reverse order");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            System.out.println(i);
        }
        sc.close();    
    }
}
