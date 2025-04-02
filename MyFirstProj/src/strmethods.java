public class strmethods {
   public static void main(String[] args) {
    String name = ("Hello");
    int value = name.length();
    System.out.println(value);
    
    String lstring = name.toLowerCase();
    System.out.println(lstring);

    String uString = name.toUpperCase();
    System.out.println(uString);

    String nontrimmString = ("       heloooo      ");
     String trimString =  nontrimmString.trim();  
    System.out.println(trimString); 

    System.out.println(name.substring(1, 3));
    
    System.out.println(name.substring(1));

    System.out.println(name.replace('l','r'));
    System.out.println(name.replace("l","r"));
    System.out.println(name.startsWith("Hel"));
    System.out.println(name.endsWith("he"));
    System.out.println(name.charAt(3));
    String modifString = ("hellollo");
    System.out.println(modifString.indexOf("lo", 5));
    System.out.println(modifString.lastIndexOf("ll", 7));
    System.out.println(name.equals("Hello"));
    System.out.println(name.equalsIgnoreCase("hello"));
    System.out.println("Hello I am \"shreya\" \n nice to meet ya\t hdwk \r fjeb\f fkhe");
   } 
}
