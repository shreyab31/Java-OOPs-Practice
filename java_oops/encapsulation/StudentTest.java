package encapsulation;
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter for name
    public String getName() {
        return name;
    }
     //setter for name
     public void setName(String name) {
        this.name = name;
    }
    //getter for age
    public int getAge() {
        return age;
    }
     //setter for age
     public void setAge(int age) {
        if (age > 0) {  // Adding validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    } 
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Shrek", 20);
        System.out.println("Name: " + s1.getName()+"\nAge: " + s1.getAge());
        s1.setName("Mickey");
        s1.setAge(25);
        System.out.println("Updated Name: " + s1.getName()+"\nUpdated Age: " + s1.getAge());
    }
}
