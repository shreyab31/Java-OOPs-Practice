package Patterns;

import java.util.Scanner;

public class letterTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i=0; i<n; i++) {                   //for (int i=1; i<=n; i++) { char ch='A'
            for (char ch='A'; ch<='A'+i; ch++) {    //for(int j=1;j<=i;j++){
                System.out.print(ch);               //System.out.print(ch++);
            }
            System.out.println();
        }
        sc.close();
    }
}
