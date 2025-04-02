import java.util.Scanner;
import java.lang.Math;
public class AllMathsProbs {
    public static void CountDigits(int n){
        int count=0;
        while(n>0){
            n=n/10;
           count++;
        }
        System.out.println(count);
    }
    public static void CountDigits2(int n){
        int count =(int)(Math.log10(n))+1;
        System.out.println(count);
    }
    public static void ReverseNum(int n){
        while (n>0) {
            int s=n%10;
            n=n/10;
            System.out.print(s);
        }
    }
    public static void ReverseNum2(int n){
        int revNum=0;
        while (n>0) {
            int ld=n%10;
            revNum=(revNum*10)+ld;
            n=n/10;
        }
        System.out.println(revNum);
    }
    public static void Palindrome(int n){
        int revNum=0;
        int num=n;
        while (n>0) {
            int ld=n%10;
            revNum=(revNum*10)+ld;
            n=n/10;
        }
        if(num==revNum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
    public static void ArmstromgNum(int n){
        int num=n;
        int s=0,a;
        while(n>0){
            a=n%10;
            n=n/10;
            s=s+a*a*a;
        }
        if(num==s)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
    }
    public static void PrintAllDivisors(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void PrintAllDivisors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            if(n/i!=i){
                System.out.print(n/i);
            }
        }
    }
    public static void Prime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            }
            if(isPrime==true)
                System.out.println("Prime");
            else
            System.out.println("Not Prime");
        }
    public static void GCD(int n, int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n,n2);i++){
                if(n%i==0&&n2%i==0){
                        gcd=i;
                    }
                }
                System.out.println("Gcd = "+gcd);
            }
    public static void GCD2(int n, int n2){
                int gcd=1;
                for(int i=Math.min(n,n2);i>=1;i++){
                    if(n%i==0&&n2%i==0){
                    gcd=i;
                    break;
                   }
                }
            System.out.println("Gcd = "+gcd);
        }
        public static void GCDEuclidianTheorem(int a, int b){
            int gcd=1;
            while(a>0&&b>0){
                if(a>b){
                 a=a%b;
                }
                else{
                b=b%a;
                }
            }
            if(a==0){
                gcd=b;
            }
            else {
                gcd=a;
            }
            System.out.println("GCD= "+gcd);
        }

                
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        //CountDigits(n);
        //CountDigits2(n);
        //ReverseNum(n);
        //ReverseNum2(n);
        //Palindrome(n);
        //ArmstromgNum(n);
        //PrintAllDivisors(n);
        //PrintAllDivisors2(n);
        //Prime(n);
        //GCD(n,n2);
        //GCD2(n, n2);
        //GCDEuclidianTheorem(n, n2);
    }
}
