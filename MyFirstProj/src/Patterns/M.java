package Patterns;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 0; i<n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
              if (j==0||j==2*i) {
                  System.out.print("*");
              }
              else System.out.print(" ");
            }
            for(int j=1;j<2*(n-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
              if (j==0||j==2*i) {
                  System.out.print("*");
              }
              else System.out.print(" ");
            }
            System.out.println();
        }   
            sc.close();  
    }
}
