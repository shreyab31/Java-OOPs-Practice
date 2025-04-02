import java.util.Scanner;
public class ifelse{
    public static void main(String[] args) {
        System.out.println("Enter your age to know whether u are an adult or not");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if(age>=18)
       {
        System.out.println("You are an adult");
       }
       else if (age>=13 && age<18)
        {
       System.out.println("You are a teenager"); 
       }
       else  if (age<13 && age!=0)
       {
        System.out.println("You are a kid");
       }
       else
       {
       System.out.println("You were never born");
       }
sc.close();
    }
}