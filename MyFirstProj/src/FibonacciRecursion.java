class Fibonacci{
    static int n1=0, n2=1,n3;
    static void printFibo(int n){
        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            printFibo(n-1);

        }
    }
}public class FibonacciRecursion {
    public static void main(String[] args) {
        int n=10;
        System.out.println(Fibonacci.n1+" "+Fibonacci.n2);
        Fibonacci.printFibo(n-2);
        
    }
    
}