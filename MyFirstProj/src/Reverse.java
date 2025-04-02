import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int num, s=0, a;
        System.out.println("Enter the num ");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0)
        {
            a=num%10;
            num=num/10;
            s=s*10+a;
        }
        System.out.println("Reverse num = "+s);
        sc.close();
    }
    
}
