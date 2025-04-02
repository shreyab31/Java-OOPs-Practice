import java.util.Scanner;
public class Patternnum2 {
public static void main(String[] args) {
    int i,n,j;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the row size");
    n=sc.nextInt();
    for (i = 0; i <=n; i++) {
        for(j=1;j<=i;j++){
            System.out.print(j);
        }
       System.out.println(" ");
        
    }
}    
}
