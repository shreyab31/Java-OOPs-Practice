import java.util.*;
class Tommy{
    public void gun(){
        System.out.println("SELECTING GUN");
    }    
    public void fire(){
        System.out.println("FIRING ON ENEMY...");
    }
    public void run(){
        System.out.println("RUNNING...");
    }
    public void jump(){
        System.out.println("JUMPING...");
    }
    public void punch(){
        System.out.println("PUNCH...");
    }
    public void kick(){
        System.out.println("KICK...");
    }
    public void sprint(){
        System.out.println("SPRINT...");
    }
    public void forw(){
        System.out.println("MOVING FORWARD...");
    }
    public void back(){
        System.out.println("MOVING BACKWARD...");
    }
    public void left(){
        System.out.println("MOVING LEFT...");
    }
    public void right(){
        System.out.println("MOVING RIGHT...");
    }
}
public class TommyVercetti {
public static void main(String[] args) {
    System.out.println("G-Gun\nF-Fire\nR-Run\nJ-Jump\nP-Punch\nK-Kick\nV-Sprint\nW-Forward\nS-Backward\nA-Left\nD-Right");
    Tommy tom= new Tommy();
    Scanner sc= new Scanner(System.in);
    char ch=sc.next().charAt(0);

    switch(ch){
        case 'G':
        case 'g':
        tom.gun();
        break;

        case 'F':
        case 'f':
        tom.fire();
        break;

        case 'R':
        case 'r':
        tom.run();
        break;

        case 'J':
        case 'j':
        tom.jump();
        break;

        case 'P':
        case 'p':
        tom.punch();
        break;

        case 'K':
        case 'k':
        tom.kick();
        break;

        case 'V':
        case 'v':
        tom.sprint();
        break;

        case 'W':
        case 'w':
        tom.forw();
        break;

        case 'S':
        case 's':
        tom.back();
        break;

        case 'A':
        case 'a':
        tom.left();
        break;

        case 'D':
        case 'd':
        tom.right();
        break;

        default:
        System.out.println();
        return;
    }
}  
}
