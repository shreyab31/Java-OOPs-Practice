import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    int fact=1, i, num;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the num");
    num=sc.nextInt();
    for (i = 1; i <=num; i++) {
        fact=fact*i;
    }
    System.out.println("Fact= "+fact);
    sc.close();
}

}
