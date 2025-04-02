import java.util.*;
public class HalfPyr180 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int r=sc.nextInt();
    for(int i=r;i>=1;i++) {
        for(int j=1;j<i;j++){
            System.out.print(" ");
          for(int k=1;k<=r;k++){
            System.out.print("*");
          }
            }
            System.out.println();
        }
    }
    }
