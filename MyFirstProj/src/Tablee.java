import java.util.Scanner;
public class Tablee {
public static void main(String[] args) {
    int i, n, t;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the num for the table to be printed");
    n=sc.nextInt();
    for(i=1;i<=10;i++){
        t=n*i; 
        System.out.println(n+ " X "+i+" = "+t);
    }
sc.close();
}    
}
