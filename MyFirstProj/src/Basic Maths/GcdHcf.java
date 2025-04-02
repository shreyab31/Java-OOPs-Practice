public class GcdHcf {
    static int brute(int n1, int n2){
        int gcd=1;
        for (int i=1;i<Math.min(n2, n1);i++){
            if(n1%i==0 &&n2%i==0){
                 gcd=i;
            }
        }
        return gcd;
    }
    static int Better(int n1, int n2){
        int gcd=1;
        for(int i=Math.min(n2,n1); i>0;i--){
            if(n1%i==0 &&n2%i==0){
                gcd=i;
                break;     
        }
    }
    return gcd;
}
static int Optimal(int a, int b){
    while (a>0 && b>0) {
        if (a>b) {
            a=a%b;
        }
        else b= b%a;
        if(a == 0) {
            return b;
        }
    }
    return a;
}
    public static void main(String[] args) {
        //System.out.println(brute(20, 15));
        //System.out.println(Better(15, 20));
        System.out.println(Optimal(12, 3));
    }
}