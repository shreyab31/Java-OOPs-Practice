import java.util.Scanner;

public class Method {
    static int operation (int x, int y){
        int z;
        if(x<y){
        z=x+y;
        }
        else
        {
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = operation (a,b);
        System.out.println(c);
    }
    }

