package Patterns;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Upper half condition
            if (i <= n) {
                // Print stars on the left (increasing)
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                // Lower half condition: print stars decreasing
                for (int j = 1; j <= 2 * n - i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
}
}
