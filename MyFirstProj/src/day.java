import java.util.Scanner;
public class day {
    public static void main(String[] args) {
       System.out.println("Enter the number to know the day");
       Scanner sc = new Scanner(System.in);
       int dayy= sc.nextInt();
       switch(dayy)
       {
        case 1 -> System.out.println("Sunday");
        case 2-> System.out.println("Monday");
        case 3 -> System.out.println("Tuesday");
        case 4 ->System.out.println("Wednesday");
        case 5 ->  System.out.println("Thurday");
        case 6 -> System.out.println("Friday");
        case 7 -> System.out.println("Saturday");
     default -> System.out.println("Wrong num entered");
       }
       sc.close();
    }
}
