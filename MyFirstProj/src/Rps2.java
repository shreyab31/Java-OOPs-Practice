import java.util.Random;
import java.util.Scanner;
public class Rps2 {
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
System.out.println("Enter\n r-rock\n p-paper \n s-scissors");
char userInput=sc.next().charAt(0);
Random random= new Random();
char computerInput;
int computerChoice=random.nextInt(3);
switch (computerChoice) {
    case 0:
    computerInput='r';
    break;
        
    case 1:
    computerInput='p';
        break;

    case 2:
    computerInput='s';
    break;
    default:
     throw new IllegalStateException("Unexpected value: " + computerChoice);
}
System.out.println("Computer Choice= "+computerInput);
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
if (userInput== computerInput ){
    System.out.println("It's a TIE");
} else if ((userInput=='r'&& computerInput=='s')|| (userInput=='p'&& computerInput=='r')|| (userInput=='s'&& computerInput=='p')) 
{
    System.out.println("YOU WIN!");
}
else
{ System.out.println("COMPUTER WINS!");
}
}
}
