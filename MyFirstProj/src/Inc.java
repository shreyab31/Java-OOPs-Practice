import java.util.Scanner;
public class Inc {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 nums");
        a=sc.nextInt();  //10
        b=sc.nextInt();  //11
        c=a*b; //110
        System.out.println("c1= "+c);
        c=a*b--; //a=10 b=11 ans-110 a=10 b=10
        System.out.println("c2= "+c);
        c=a--*b; //a=10 b=10 ans-100 a=9 b=10
        System.out.println("c3= "+c);
        c=a*b++; //a=9 b=10 ans-90 a=9 b=11
        System.out.println("c4= "+c);
        c=a++*b; //a=9 b=11 ans-99 a=10 b=11
        System.out.println("c5= "+c);
        c=++a*--b; //a=10 b=11 ans-110 a=11 b=10
        System.out.println("c6= "+c);
        c=++a*b; //a=12 b=10 ans-120 a=12 b=10
        System.out.println("c7= "+c);
        c=a*--b; //a=12 b=9 ans-108 a=12 b=9
        System.out.println("c8= "+c);

sc.close();

    }
}
