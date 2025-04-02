public class NtimesPrint {
    static void print(int i, int n){
        if (i>n) return;
        System.out.println("hello");
        print(i+1, n);
    }
    public static void main(String[] args) {
        print(1, 4);
    }
}
