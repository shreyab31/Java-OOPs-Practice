import java.util.Scanner;
class phone{
    public void calling(String name){
        System.out.println("Calling "+name+"...");
        vibrate();
    }
    public void vibrate(){
        System.out.println("Vibrating...");
        ringing();
    }
    public void ringing(){
        System.out.println("Ringing...");
    }
}
public class Cellphone {
    public static void main(String[] args) {
        System.out.println("Choose the name to call\n 1.Anil\n 2.Richa\n 3.Jahnvi\n 4.Yash");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name;
        switch(n)
        {
            case 1:
            name="Anil";
            break;

            case 2:
            name="Richa";
            break;

            case 3:
            name="Jahnvi";
            break;

            case 4:
            name="Yash";
            break;

            default:
            System.out.println("Invalid choice");
            return;
        }
        phone x=new phone();
        x.calling(name);
    }
}
