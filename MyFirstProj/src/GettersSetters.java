 class Employee {
    private int id;
    private String name;
 public void setname(String n){
    name=n;
 }
 public void setid(int i){
    id=i;
 }
public String getname(){
    return name;
}
public int getid(){
    return id;
}
}
public class GettersSetters {
public static void main(String[] args) {
    Employee obj = new Employee();
    obj.setid(12);
    obj.setname("ejekr");
    System.out.println(obj.getid());
    System.out.println(obj.getname());
}
}