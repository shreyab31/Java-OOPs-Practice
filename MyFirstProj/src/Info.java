import java.util.Scanner;
public class Info {
    public static void main(String[] args) {
        int roll;
        float per;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
         System.out.println("Enter the roll");
         roll=sc.nextInt();
        System.out.println("Enter the per");
        per=sc.nextFloat();
        System.out.println("Name= "+name);
        System.out.println("Roll= "+roll);
        System.out.println("Per= "+per);
        sc.close();
    }
}
