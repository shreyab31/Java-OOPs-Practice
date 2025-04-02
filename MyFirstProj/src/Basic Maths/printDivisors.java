import java.util.ArrayList;

public class printDivisors {
    static ArrayList<Integer> brute(int n){
        ArrayList<Integer> div= new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                div.add(i);
            }
        }
        return div;
    }
    static ArrayList<Integer> optimal(int n){
        ArrayList<Integer> div= new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n%i==0) div.add(i);
            if (i!=n/i) div.add(n/i);
        }
        return div;
    }
    public static void main(String[] args) {
       // ArrayList<Integer> div = brute(12);
       ArrayList<Integer> div = optimal(12);
        for (int num : div) {
            System.out.print(num+" ");
        }
    }
}
