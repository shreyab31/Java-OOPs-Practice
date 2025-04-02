import java.util.Scanner;
class sq{
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
        float ar=s*s;
        return ar;
    }
    public float peri(){
        float p=4*s;
        return p;
    }
}
public class Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    sq obj= new sq();
    int n;
    System.out.println("Enter\n1.Area\n2.Perimeter\n3.All");
    n=sc.nextInt();
    switch(n){
    case 1:
    obj.getside();
    float area=obj.area();
    System.out.println("Area= "+area);
    break;

    case 2:
    obj.getside();
    float perim= obj.peri();
    System.out.println("Perimeter= "+perim);
    break;

    case 3:
    obj.getval();
    break;

    default:
    System.out.println("Invalid choice");
    return;
}
}
}
