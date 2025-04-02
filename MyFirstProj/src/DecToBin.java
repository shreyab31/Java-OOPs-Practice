import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int binNo=n;
        int bin=0;
        int pow=0;
        while (n>0) {
            int r=n%2;
             bin+=(int)(r*Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binNo+" to binary is "+bin);
    }
}
