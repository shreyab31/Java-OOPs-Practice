package Patterns;

import java.util.Scanner;

public class InvFullTri{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0; j<i;j++){                     //for(j=0; j<n-i-1;j++){                                                        //}
                System.out.print(" ");               // sout(" ")}
            }                                          
            for(int j=n; j>i;j--){
                System.out.print("*");              //for (j=0; j<2*n-(2*i+1); j++){                                                        //}
            }                                          // sout("*");
            for(int j=n-1; j>i;j--){                   //for(j=0;j<n-i-1;j++)
                System.out.print("*");               //sout(" ")}
            }
            System.out.println();
        }
        sc.close();
    }
}
