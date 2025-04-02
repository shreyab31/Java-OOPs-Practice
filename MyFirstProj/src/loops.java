import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    for(int i=n;i>=0;i--)
    {
        System.out.println(i);
    }
     sc.close();
 }
}
