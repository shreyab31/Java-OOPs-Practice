public class Reversenum {
    public static void main(String[] args) {
        int ld, n, rev=0;
        n=10899;
        /*while (n>0) {
            ld=n%10;
            n=n/10;
            System.out.print(ld);
            System.out.println("BY another method");*/
            while (n>0) {
                ld=n%10;
                n=n/10;
                rev=(rev*10)+ld;
            }
            System.out.println(rev);
        }
    }

