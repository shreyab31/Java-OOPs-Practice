import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
    int i,n,j;
    System.out.println("Enter the row size");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<=n;i++)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}    
}
