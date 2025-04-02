import java.util.Scanner;
public class Armstrong {
 public static void main(String[] args) {
    int num, s=0, a;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number to know if it is armstrong");
    num=sc.nextInt();
    int n=num;
    while(num!=0)
    {
        a= num %10;
        num=num/10;
        s=s+a*a*a;
    }
    if(s==n){
        System.out.println("num is armstrong");
    }
    else{
        System.out.println("num is NOT armstrong");
    }
 sc.close();
 }   
}
