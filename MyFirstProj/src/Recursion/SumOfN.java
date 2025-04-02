public class SumOfN {
    static int sum(int i, int sum, int n){
        if (i>n) return sum;
         return sum(i+1, sum+i, n);
    }
    public static void main(String[] args) {
        System.out.println(sum(1, 0, 5));
    }
}
