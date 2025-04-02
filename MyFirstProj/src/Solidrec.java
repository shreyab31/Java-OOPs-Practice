import java.util.*;
public class Solidrec {
 public static void main(String[] args) {
    System.out.println("Enter rows and columns");
    Scanner sc= new Scanner(System.in);
    int r= sc.nextInt();
    int c= sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
sc.close();
 }    
}
