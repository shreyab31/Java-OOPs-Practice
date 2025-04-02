public class Print1toNnum {
    static void print(int i, int n){
        if (i>n) return;
        System.err.print(i);
        print(i+1, n);
    }
    public static void main(String[] args) {
        print(1, 5);
    }
}
