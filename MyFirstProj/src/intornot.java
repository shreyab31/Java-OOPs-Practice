import java.util.Scanner;

public class intornot {
    public static void main(String[] args){
        System.out.println("Enter your num");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
