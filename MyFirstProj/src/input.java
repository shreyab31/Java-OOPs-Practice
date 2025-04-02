import java.util.Scanner;
public class input {
    public static void main(String[] args)
    {
     System.out.println("taking input");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num a");
      float a = sc.nextFloat();
     //int a = sc.nextInt();
      System.out.println("Enter num b");
      float b = sc.nextFloat();
       // int b = sc.nextInt();
      float sum = a + b;
      System.out.println("sum of the a and b is = ");
     System.out.println(sum); 
     String str = sc.nextLine();
      System.out.println(str);
       boolean b1 = true;
     System.out.println(b1);
     sc.close();
    }
}
