import java.util.Scanner;
import java.math.*;

public class MyBinToDec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;
        int pow=0;
        while(n>0){
           int ld=n%10;
           n=n/10;
            dec+=(int)(ld*Math.pow(2,pow));
            pow++;
            }
               System.out.println("To decimal= "+dec);
        
        }
        }

    
