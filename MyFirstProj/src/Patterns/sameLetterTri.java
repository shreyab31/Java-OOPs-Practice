package Patterns;

import java.util.Scanner;

public class sameLetterTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        char ch='A';
        for (int i=0; i<n; i++) {                   //for (int i=1; i<=n; i++) { char ch='A'
            for(int j=0;j<=i;j++){
                System.out.print(ch);               //System.out.print(ch++);
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}
