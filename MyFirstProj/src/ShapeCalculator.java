import java.util.Scanner;
class Square{
    float s;
    public void getval()
    {
        getside();
        float area= area();
        System.out.println("Area= "+area);
        float perim=peri();
        System.out.println("Perimeter= "+perim);
    }
    public float getside()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of the square");
         s=sc.nextFloat();
        return s;
    } 
    public float area(){
        return s*s;
    }
    public float peri(){
        return 4*s;
    }
}
class Rectangle{
    float l;
    float b;

    public void getval(){
        getSides();
        System.out.println("Area= "+area());
        System.out.println("Perimeter= "+peri());
    }
    public void getSides(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextFloat();
        System.out.println("Enter breadth");
        b=sc.nextFloat();
    }
    public float area(){
        return l*b;
    }
    public float peri(){
        return 2*(l+b);
    }
}
class Circle{
    float r;
    public void getval(){
        getside();

    }
    public void getside(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextFloat();
        System.out.println("Area= "+area());
        System.out.println("Circumference= "+cir());
    }
    public float area(){
        return (float)(3.14*r*r);
    }
    public float cir(){
        return (float)(2*3.14*r);
    }
}
public class ShapeCalculator{
public static void main(String[] args) {
    System.out.println("Enter\n1.Square\n2.Rectangle\n3.Circle");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    switch(n)
    {
        case 1:
        Square sq=new Square();
        sq.getval();
        break;

        case 2:
        Rectangle rec=new Rectangle();
        rec.getval();
        break;

        case 3:
        Circle circ=new Circle();
        circ.getside();
        break;

        default:
        System.out.println("INVALID CHOICE");

    }
}
}
