import java.util.*;
 class MethodOverloading {
    int r, b,h, ll, bb;
    float ar,hh;
   Scanner sc=new Scanner(System.in);
   void area(){
    System.out.println("Enter the radius");
    r=sc.nextInt();
    ar=3.14f*r*r;
    System.out.println("Area of the circle "+ar);
   }
   void area(int x, int y){
    b=x;
    h=y;
    ar=b*h;
    System.out.println("Area of rectangle "+ar);
   }
   void area(int x, float y)
   {
    bb=x;
    hh=y;
    ar=1/2f*b*h;
    System.out.println("Area of triangle "+ar);
   }
}
 class MethodOverloadingMain {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int le,be,ba;
    float he;
    System.out.println("Enter the length and breadth of reactangle");
    le=sc.nextInt();
    be=sc.nextInt();
    System.out.println("Enter base and height of triangle");
    ba=sc.nextInt();
    he=sc.nextFloat();
    MethodOverloading mo= new MethodOverloading();
    mo.area();
    mo.area(le, be);
    mo.area(ba, he);
    sc.close();
}
}

