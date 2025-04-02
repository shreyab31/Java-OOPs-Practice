import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
    int num, n, s=0,a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num to know if it is palindrome or not");
    num=sc.nextInt();
    n=num;
    while(num!=0)
    {
        a=num%10;
        num=num/10;
        s=s*10+a;
    }
    System.out.println("Reversed num = "+s);
    if(n==s)
    {
        System.out.println("Number is palindrome");
    }
    else{
         System.out.println("Number is NOT palindrome");
    }
    sc.close();
}    
}
