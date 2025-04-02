import java.util.Scanner;
public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ROCK = 1, PAPER = 2, SCISSORS =3;
System.out.println("Choose  1 = ROCK\n\t2 = PAPER \n\t3 = SCISSORS");
System.out.println("CHOOSE PLAYER 1");
     int p1= sc.nextInt();
     System.out.println("CHOOSE PLAYER 2");
     int p2 = sc.nextInt();
     if (p1==p2)
     {
        System.out.println("TIE");
     }
     else{
     switch(p1)
     {
        case 1:
        {
     if (p2==PAPER)
     {
        System.out.println("PLAYER 2 WINS");
     }
     else
     {
        System.out.println("PLAYER 1 WINS");
     }
     break;
    }
     case 2:
     {
        if(p2==SCISSORS)
     { System.out.println("PLAYER 2 WINS");
     }
      else
     {
        System.out.println("PLAYER 1 WINS");
     }
     break;
    }
     case 3:
    {if (p2==ROCK) {
        System.out.println("PLAYER 2 WINS");
    }
    else
     {
        System.out.println("PLAYER 1 WINS");
     }
     break;
     }
   
    }
      sc.close();
}
    }
}


