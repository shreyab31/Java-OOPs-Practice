import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrimeNum {
    static boolean brute(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
    }
     return true;
}   
static boolean optimal(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0) return false;
}
 return true;
}
    static void CheckFactorsAndPrime(int n){
        int count = 0;
        boolean isPrime=true;
        ArrayList<Integer> factors = new ArrayList<>();
        factors.add(1);
        if (n != 1) factors.add(n);
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime=false;
                factors.add(i);
                if(i!=n/i) factors.add(n/i);
            }       
            }
            Collections.sort(factors);
            System.out.print(factors);
            System.out.println(" "+n +" "+(isPrime ? "is prime" : "is not prime"));
    }
    public static void main(String[] args) {
        //System.out.println(brute(9));
        //System.out.println(optimal(36));
        CheckFactorsAndPrime(37);;
    }
}