package Patterns;

import java.util.Scanner;

public class RevLetterTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        sc.close(); 
        for (int i=0; i<n; i++) {
            char ch = (char) ('A' + n - 1 - i);
            for (int j =0; j<=i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
