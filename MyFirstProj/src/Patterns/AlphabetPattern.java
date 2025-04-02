package Patterns;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        char ch='a';
        for (int i = 0; i<n; i++) {
            for(int j =0; j<=i; j++){
                if (ch%2==0) {
                   System.out.print(Character.toUpperCase(ch++));
                }
                else System.out.print(ch++);
            }
            System.out.println();
        }
        sc.close();  
    }
}
