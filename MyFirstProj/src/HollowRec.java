import java.util.Scanner;

public class HollowRec {
    public static void main(String[] args) {
        System.out.println("Enter rows and cols");
        Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        byte m=sc.nextByte();
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
