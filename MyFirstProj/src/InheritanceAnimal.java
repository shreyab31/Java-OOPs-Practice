class Animal{
    String s=("I am animal class");
}
class Dog extends Animal{
   String d=("I am dog and belongs to animal class");

}public class InheritanceAnimal {
    public static void main(String[] args) {
        Dog dg= new Dog();
        System.out.println(dg.s);
        System.out.println(dg.d);
    }    
}
