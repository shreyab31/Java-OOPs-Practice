public class Nto1print {
    static void print(int i){
        if(i<1) return;
        System.out.println(i);
        print(i-1);
    }
    public static void main(String[] args) {
        print(5);
    }
}
