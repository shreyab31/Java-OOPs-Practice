import java.util.Scanner;

public class PrimeOrNot {
    boolean PrimeOrNot(int n){
        boolean isPrime=false;
        for(int i=2;i<=n-2;i++){
            if(n%i==0){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        PrimeOrNot p= new PrimeOrNot();
        boolean n= p.PrimeOrNot(x);
        
        if(n==false){
            System.err.println("NOT PRIME");
        }
        else{
            System.out.println("PRIME");
        }
    }
    }
