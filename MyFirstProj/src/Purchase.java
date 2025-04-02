import java.util.Scanner;
public class Purchase {
    public static void main(String[] args) {
    int pur, dis=0, total;
        System.out.println("Enter the purchase amount");
        Scanner sc= new Scanner(System.in);
        pur=sc.nextInt();
        if(pur>=5000)
        {
           dis=(pur*10)/100;
        total=pur-dis;
       System.out.println("The amount to be paid= "+total);}
       else{
        System.out.println("The amount to be paid= "+pur);
       }
sc.close();
}
}
