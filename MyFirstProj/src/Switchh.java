import java.util.Scanner;
public class Switchh {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age if 18/23/60");
        Scanner sc =  new Scanner(System.in); 
        age = sc.nextInt();
if (age == 18 || age== 23 || age==60 )
{
        switch(age){
            case 18:
           { System.out.println("You are an adult");}
                        break;

         case 23:
           { System.out.println("You are going to get a job");}
            break;

            case 60:
           { System.out.println("You are an old citizen");}
            break;

            default:
            {
                System.out.println("you are not alive");
            }
        }
    }
    else
    {
        System.out.println("Wrong choice of age");
    }
    sc.close();
}
    }


