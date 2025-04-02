public class fibonacci {
    static int[] brute(int n){
        int a[]= new int[n];
        a[0]=0;
        a[1]=1;
        for (int i = 2; i < n; i++) {
           a[i]=a[i-1]+a[i-2];
        }
        return a;
    }
    static void better(int n){
        if (n==1) System.out.print(0);
        int seclast=0;
        int last=1;
        System.out.print(seclast + " " + last + " ");
        for (int i = 2; i <n; i++) {
            int cur=last+seclast;
            seclast=last;
            last=cur;
            System.out.print(cur+" ");
        }
    }
    static int recursive(int n){
        if (n<=1) return n;
        int last= recursive(n-1);
        int slast=recursive(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        //System.out.println(recursive(4));
        /*int a[]=brute(8);
        for (int i : a) {
            System.out.print(i);
    }*/
            better(8);
        }
    }

