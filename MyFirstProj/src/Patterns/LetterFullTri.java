package Patterns;

import java.util.Scanner;

public class LetterFullTri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for (int i=0; i<n; i++) { 
            //space                  
            for (int j=0; j<n-i-1; j++) {    
                System.out.print(" ");              
            }
            //letters
            int breakpoint=(2*i+1)/2;
             //space             
             char ch='A';     
             for (int j=0; j<2*i+1; j++) {    
                System.out.print(ch);
                if (j<=breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}
