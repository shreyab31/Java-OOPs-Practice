import java.util.*;
class Employee{
    int empno, sal;
    String ename;
    void getval(int x, int y, String z)
    {
        empno=x;
        sal=y;
        ename=z;
    }
    void display(){
        System.out.println("EMPLOYEE NO.: "+empno);
        System.out.println("EMPLOYEE NAME: "+ename);
        System.out.println("SALARY: "+sal);
    }
}
    class EmployeeMain{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Employee name");
            String z=sc.nextLine();
            System.out.println("Enter the Employee num");
            int x=sc.nextInt();
            System.out.println("Enter the salary");
            int y=sc.nextInt();
            Employee em = new Employee();
            em.getval(x,y,z);
            em.display();
            sc.close();
        }
    }
