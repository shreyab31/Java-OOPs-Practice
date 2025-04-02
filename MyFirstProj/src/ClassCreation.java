import java.util.Scanner;
;class Employee{
    int id;
    String name;
    int sal;
    public void  print(){
        getsalary();
        System.out.println("ID="+id);
        System.out.println("NAME=" +name);
        System.out.println("SALARY=" +sal);
    }
    public void getsalary(){
        System.out.println("enter salary of " +name +":");
        Scanner sc= new Scanner(System.in);
         sal=sc.nextInt();
    }
}public class ClassCreation {
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.id=12;
        emp1.name = "Anil";
        emp1.print();
        Employee emp2= new Employee();
        emp2.id=14;
        emp2.name="shruti";
        emp2.print();

    }
}
