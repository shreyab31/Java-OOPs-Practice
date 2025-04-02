package Patterns;

import java.util.Scanner;

public class NumDiamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int val=i;
            for (int j = 1; j<=i; j++) {
                System.out.print(val--);
            }
            val=2;
            for (int j = 1; j<i; j++) {
                System.out.print(val++);
            }
            
            System.out.println();
    }
    for (int i = 1; i<=n-1; i++) {
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        int val=n-i;
        for (int j = 1; j<=n-i; j++) {
            System.out.print(val--);
        }
        val=2;
            for (int j = 1; j<n-i; j++) {
                System.out.print(val++);
            }
            System.out.println();
}
}
}