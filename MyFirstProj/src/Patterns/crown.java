package Patterns;

import java.util.Scanner;

public class crown {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 1; i<=n; i++) {
            //num
            for (int j=1; j <=i; j++) {
                System.out.print(j);
            }
            //space
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //num
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
