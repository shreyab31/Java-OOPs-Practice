import java.util.Scanner;

public class StrivRecursion {
    static int count = 0; 
    static void name(int n){
        if (count==n)
        return;
        System.out.println("Shreya");
        count++;
        name(n);
    }
    static void name2(int i,int n){
        if (i>n)
        return;
        System.out.println("Shreya");
        name2(i+1,n);
    }
    static void Num1toN(int i,int n){
        if(i>n)
        return;
        System.out.println(i);
        Num1toN(i+1, n);
    }
    static void NumNto1(int n){
        if(n<1)
        return;
        System.out.println(n);
        NumNto1(n-1);
    }
    static void NumNto1again(int i){
        if(i<1)
        return;
        System.out.println(i);
        NumNto1again(i-1);
    }
    static void Num1toNbacktrack(int i, int n){
        if(i<1) return;
        Num1toNbacktrack(i-1,n);
        System.out.println(i);
    }
    static void NumNto1backtrack(int i, int n){
        if(i>n) return;
        NumNto1backtrack(i+1,n);
        System.out.println(i);
    }
    static void SumOfN(int i, int sum){
        if(i<1){
        System.out.println(sum);
        return;
    }
        SumOfN(i-1, sum+i);
    }
    static int SumOfNFunctional(int n){
        if(n==0)
        return 0;
        else
        return n+SumOfNFunctional(n-1);
    }
    static int FactNfunc(int n){
        if(n==1)
        return 1;
        else
        return FactNfunc(n-1)*n;
    }
    static void RevArray( int a[], int l, int r){
        if(l>=r){
            return;
        }
        else{
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            RevArray(a, l+1, r-1);
    }
    }
    static void RevArray2( int a[], int i, int n){
        if(i>n/2) return;
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
        RevArray2(a, i+1, n);
    }
    static boolean PalindromeString( int i, String s){
        if(i>=s.length()/2)return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return PalindromeString(i+1, s);
    }
    static int Fibonacci(int n){
        if(n<=1)return n;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        //name(n);
        //name2(1, n);
       //Num1toN(1, n);
       //NumNto1(n);
       //NumNto1again(n);
       //Num1toNbacktrack(n,n);
        //NumNto1backtrack(1, n);
        //SumOfN(n, 0);
        //System.out.println(SumOfNFunctional(n));
        //System.out.println(FactNfunc(n));
        /*int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Before Swap");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
          int l=0, r=a.length-1;
        RevArray(a, l, r);
        System.out.println("After Swap");
        for (int i=l; i<=r; i++){
            System.out.print(a[i]+" ");
        }            
        RevArray2(a, 0, a.length);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");*/        
        /*    String s="madam";
            System.out.println(PalindromeString(0, s));
            }     */
            
        System.out.println(Fibonacci(4));
        }
    }

