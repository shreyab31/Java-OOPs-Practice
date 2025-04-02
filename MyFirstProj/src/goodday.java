import java.util.Scanner;

public class goodday {
    public static void main(String[] args){
        System.out.println("what is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println(" Hello " + name + " have a good day");
        s.close();
    }
}
