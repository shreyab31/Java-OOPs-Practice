import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        System.out.println("Enter your salary");
        Scanner sc = new Scanner(System.in);
         float sal = sc.nextFloat();
         float tax = 0;
        if (sal<=2.5f)
        {
            tax = tax + 0;
        }
        else if(sal>2.5f && sal<=5f)
        {
            tax= tax + 0.05f*(sal-2.5f); 
        }
        else if(sal>5f && sal<=10f)
        {
             tax= tax + 0.05f*(5.0f-2.5f); 
            tax=  tax + 0.2f*(sal-5f);
        }
        else if (sal>10f)
        {
             tax= tax + 0.05f*(5.0f-2.5f); 
             tax= tax + 0.2f*(10f-5f);
            tax= tax + 0.5f*(sal-10f);
        }
        System.out.println("The total tax paid by the employee" + tax);
            sc.close();
    }
}
