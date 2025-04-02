import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter 2 num");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("A is greater");
        }
        else if(b>a){
            System.out.println("B is greater");
        }
        else{
            System.out.println("Values are equal");
        }
        sc.close();
    }
}
