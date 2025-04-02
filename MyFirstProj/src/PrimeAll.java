import java.util.Scanner;
class Prime{
    public boolean isPrime(int n) {
    boolean isPrime=true;
    if(n<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
        }
        return true;
    }
    }

 class PrimeInRange {
    public void PrintPrime(int start, int end){
    Scanner sc = new Scanner(System.in);
        Prime p=new Prime();
        for(int i=start;i<=end;i++){
            if(p.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    } 
}
    public class PrimeAll{
        public static void main(String[] args) {
            System.out.println("Enter\n 1-To check number is prime or not\n 2-To print prime numbers in give range");
            Scanner sc = new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter num");
                int n=sc.nextInt();
                Prime p = new Prime();
                boolean isPrime=p.isPrime(n);
                System.out.println(n+" is"+(isPrime?" PRIME":" NOT PRIME"));                    
                    break;
                    case 2:
                    System.out.println("Enter the range\n from");
                    int start=sc.nextInt();
                    System.out.println("to");
                    int end=sc.nextInt();
                    System.out.println("Printing prime numbers from range "+start+" to "+end);
                    PrimeInRange r= new PrimeInRange();
                    r.PrintPrime(start,end);
                    break;
            
                default:
                System.out.println("Wrong choice");
                    break;
            }

    }
}


