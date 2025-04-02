public class Factortial {
    static int fact(int i, int fact){
        if(i==0) return fact;
         return fact(i-1, fact*i);
    }
    public static void main(String[] args) {
        System.out.println(fact(4, 1));
    }
}
