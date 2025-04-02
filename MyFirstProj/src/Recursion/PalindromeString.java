public class PalindromeString {
    static boolean tryy(String str) {
        StringBuilder s=new StringBuilder(str).reverse();
        return str.equals(s.toString());
    }
    public static void main(String[] args) {
        String str="ABCBAa";
        System.out.println(tryy(str));
    }
}
