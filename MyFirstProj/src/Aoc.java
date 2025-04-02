import java.util.Scanner;
public class Aoc {
    public static void main(String[] args) {
        float r, ar, p= 3.14f;
        System.out.println("Enter the radius");
        Scanner sc= new Scanner(System.in);
        r=sc.nextFloat();
        ar= p*r*r;
        System.out.println("The area of the circle is: "+ar);
        sc.close();

    }
}
