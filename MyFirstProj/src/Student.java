import java.util.*;
 class Student {
    int rollno;
    String name;
    Float per;
    Scanner sc= new Scanner(System.in);
    void getvalue(){
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter roll num");
        rollno=sc.nextInt();
        System.out.println("Enter the percentage");
        per=sc.nextFloat();
    }
    void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student roll num: "+rollno);
        System.out.println("Student Percentage: "+per);

}
 }
    class Studentmain{
        public static void main(String[] args) {
            Student st= new Student();
            st.getvalue();
            st.display();
        }
}

