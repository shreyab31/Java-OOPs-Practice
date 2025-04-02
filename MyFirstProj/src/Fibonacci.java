public class Fibonacci {
    public static void main(String[] args) {
        byte n3, n1=0, n2=1, count=10;
        for(byte i=2;i<count;i++){
            n3=(byte)(n1+n2);
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }

    }
}
