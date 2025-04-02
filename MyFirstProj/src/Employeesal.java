import java.util.Scanner;
class Employee{
    int sal;
    String name;
    int id;
    Scanner sc= new Scanner(System.in);
    public void getval(){
        getname();
        getsal();
        printdts();
    }
    public String getname(){
        System.out.println("Enter name");
        name=sc.next();
        return name;
    }
    public int getsal(){
        System.out.println("Enter sal for "+name);
        sal=sc.nextInt();
        return sal;
    }
    public void printdts(){
        System.out.println("Name= "+name);
        System.out.println("Salary= "+sal);
    }

}public class Employeesal {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.getval();

    }
}
