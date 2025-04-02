import java.util.*;
public class StarTriangle {
    public static void main(String[] args) {
        System.out.println("enter rows and cols");
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }    
}
