import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        System.out.println("Enter 5 subject marks");
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float d = s.nextFloat();
        float e = s.nextFloat();
        float sum = a + b + c +d + e;
        float per = (sum)*100/500;
        System.out.println("CBSE BOARD MARKSHEET");
        System.out.println(" marks of eng");
        System.out.println(a);
        System.out.println(" marks of hindi");
        System.out.println(b);
        System.out.println(" marks of maths");
        System.out.println(c);
        System.out.println(" marks of science");
        System.out.println(d);  
        System.out.println(" marks of social");
        System.out.println(e);
        System.out.println("percentage");
        System.out.println(per);
        s.close();
    }
}
