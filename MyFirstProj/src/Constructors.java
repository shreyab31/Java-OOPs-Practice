class Employee{
    private String name;
    private int id;
    private int sal;

    public Employee(int i, String n, int s){
        id=i;
        name=n;
        sal=s;
    }
    public Employee(String n){
        id=12;
        name=n;

    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getsal(){
        return sal;
    }
    public void getdeets(){
        System.out.println(getid());
        System.out.println(getname());
        System.out.println(getsal());
    }
}
public class Constructors {
    public static void main(String[] args) {
        Employee em= new Employee(1,"Shreya", 18000);
        Employee e= new Employee("Shreya");
        em.getdeets();
        e.getdeets();
    }
}
