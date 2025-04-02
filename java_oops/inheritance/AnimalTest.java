package inheritance;  // Ensure you're running from the correct folder

  class Animal {
    public void makeSound() {
        System.out.println("This animal is making a sound");
    }
}

 class Cat extends Animal {
    public void makeSound() {
        System.out.println("cat is making sound");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat meow = new Cat();
        animal.makeSound();
        meow.makeSound();
    }
}
