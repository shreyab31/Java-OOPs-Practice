import java.util.Scanner;
public class web {
    public static void main(String[] args) {
       System.out.println("Enter the name of the website"); 
    Scanner sc = new Scanner(System.in);
    String website = sc.next();
    
    if(website.endsWith(".org"))
    {
  System.out.println("organisational website");
    }
    else if(website.endsWith(".com"))
    {
        System.out.println("commercial website");
    }
    else if(website.endsWith(".in"))
    {
        System.out.println("Indian website");
    }
    else{
        System.out.println("wrong input");
    }
    sc.close();
}
    }


