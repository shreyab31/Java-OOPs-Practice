class Base{
    public int x;
    public void setX(int x) {
        System.out.println("Setting x now");
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public Base(){
        System.out.println("CONSTRUCTOR");
    }
}
    class Derived extends Base{
        int y;
        public void setY(int y) {
        System.out.println("Setting Y now");
            this.y = y;
        }
        public int getY() {
            return y;
        }
        public Derived(){
            System.out.println("Constructor derived");
        }
    }
public class Inheritance {
 public static void main(String[] args) {
    Derived d= new Derived();
    d.setX(45);
    System.out.println(d.getX());
    d.setY(66);
    System.out.println(d.getY());
 }   
}
