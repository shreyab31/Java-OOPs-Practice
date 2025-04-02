import java.util.Scanner;
public class ArrLarge {
public static void main(String[] args) {
    int large,i;
    int a[]= new int[5];
    Scanner sc= new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    large=a[0];
    for(i=0;i<a.length;i++)
    {
        if(a[i]>large){
            large=a[i];
        }
    }
    System.out.println("The largest num "+a[i]+" is found at index pos "+i);
    sc.close();
}    

}
