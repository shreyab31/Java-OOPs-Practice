import java.util.Scanner;

public class asso {
    public static void main(String[] args) {
        System.out.println("enter the value of x and y");
        Scanner s = new Scanner(System.in);
        float x = s.nextInt();
        float y = s.nextInt();
        float z = (x-y)/2;
        System.out.println("(x-y)/2 = " +z);
    System.out.println("Enter the values of b, a and c");
        float b = s.nextInt();
         float a = s.nextInt();
        float c = s.nextInt();
        float d = (b*b- 4*a*c)/(2*a);
        System.out.println("D = " + d);
        System.out.println("Enter the values of v and u");
        float v = s.nextInt();
         float u = s.nextInt();
        float w = v*v - u*u;
        System.out.println("v square - u square = " + w);
         System.out.println("Enter the values of e, f and g");
        float e = s.nextInt();
        float f = s.nextInt();
         float g = s.nextInt();
        float h = e*f - g;
        System.out.println("e*f-g = " + h);
    s.close();
    }
}
