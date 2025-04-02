class Circle{
    private float radius,area, circumference;
    public void setrad(float r){
     radius=r;
 }
 public void setar(float a){
    if(a==3.14*radius*radius)
    area=a;
    else
    System.out.println("The area is wrong for the entered radius");
 }
 public void setcir(float c){
    if(c==2*3.14*radius)
    circumference=c;
    else
    System.out.println("The circumference is wrong for the entered radius");
 }
 public float getrad(){
    return radius;
 }
 public float getar(){
    return area;
 }
 public float getcir(){
    return circumference;
 }
}
public class CirclePriv {
public static void main(String[] args) {
    Circle cr= new Circle();
    cr.setrad(3.0f);
    cr.setar(28.274f);
    cr.setcir(18.849f);
    System.out.println("Area : "+cr.getar()+" sq. cm");
    System.out.println("circumference : "+cr.getcir()+" sq. cm");
}
}