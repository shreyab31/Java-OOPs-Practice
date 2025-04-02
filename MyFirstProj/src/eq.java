import java.util.Scanner;

public class eq {
    public static void main(String[] args) {
        System.out.println("Enter the values of v, u, a and s");
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
         float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();
        float eq = (v*v- u*u)/(2*a*s);
        System.out.println(eq);
        sc.close();
    }
}
