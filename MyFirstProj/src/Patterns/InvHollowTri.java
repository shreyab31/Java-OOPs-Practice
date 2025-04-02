package Patterns;

import java.util.Scanner;

public class InvHollowTri {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 0; i<n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n-2*i)-1;j++){
              if (j==0||j==(2*n-2*i)-2||i==0) {
                  System.out.print("*");
              }
              else System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }   
            sc.close();  
    }
}
