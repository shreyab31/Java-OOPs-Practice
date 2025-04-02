class Base{
  Base(){
    System.out.println("Base constructor");
    }
    Base(int x){
        System.out.println("X= "+x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor");
    }
    Derived(int x){
        super(x);
        System.out.println("D- X= "+x);
    }
}
class Child extends Derived{
    Child(){
        System.out.println("Child constructor");
    }
    Child(int x, int y){
        super(11);
        System.out.println("X= "+x+" Y= "+y);
    }
}
public class InheritanceCons {
    public static void main(String[] args) {
     Child c= new Child(1,2);
     
    }
}
