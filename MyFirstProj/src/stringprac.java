public class stringprac {
public static void main(String[] args) {
     String name = ("   Helloo   ");
            System.out.println(name.toLowerCase());
            System.out.println(name.replace(' ', '_'));
            String letter = ("Dear |name|, thanks a lot");
            System.out.println(letter.replace("|name|", "Shreya"));
        String myString = ("this string contains  double and triple   spaces");
        System.out.println(myString.indexOf("  "));
         System.out.println(myString.indexOf("   "));
}
    }
