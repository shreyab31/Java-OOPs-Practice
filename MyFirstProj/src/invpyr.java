import java.util.Scanner;

public class invpyr {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n to print the inverted pyramid");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // Use System.out.print to print asterisks on the same line
            }
            System.out.println("\n"); // Move to the next line after printing asterisks
        }
         sc.close();
    }
}
