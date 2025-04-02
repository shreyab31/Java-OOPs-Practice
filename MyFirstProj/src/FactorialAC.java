class Fact{
    public static int Fact(int n){
       int f=1;
        for(byte i=1;i<=n;i++){
        f=f*i;
        }
        return f;
}
    public static int BionomialCoeff(int n, int r){
        int fact_n=Fact(n); //nCr=n!/r!(n-r)!
        int fact_r=Fact(r);
        int fact_nmr=Fact(n-r);
        int bnc=fact_n/(fact_r*fact_nmr);
        return bnc;
    }
}
public class FactorialAC {
    public static void main(String[] args) {
        System.out.println(Fact.Fact(5));
        System.out.println(Fact.BionomialCoeff(5, 2));
        
    }
}
