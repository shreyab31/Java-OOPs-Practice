import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        int n,i=10;
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(i>=1)
        {
            System.out.printf("%d X %d = %d\n", n, i, n*i);
            i--;
        }
         sc.close();
    }  
}
