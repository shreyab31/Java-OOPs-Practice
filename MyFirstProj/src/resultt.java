import java.util.Scanner
;public class resultt {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

         System.out.println("Enter your marks in maths");
        m2= sc.nextByte();

         System.out.println("Enter your marks in chemistry");
        m3= sc.nextByte();

       float per= (m1+m2+m3)/3.0f;

        if(per>=40 && m1>=33 && m2>=33 && m3>=33)
        {
System.out.println("PASSED with "+ per);
        }
        else{
            System.out.println("FAILED");
        }
          sc.close();
                }
              

}
