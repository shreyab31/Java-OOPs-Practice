import java.util.Scanner;
public class ArrSearch {
public static void main(String[] args) {
    int a[]= new int[5], i, search, f=0;
        Scanner sc= new Scanner(System.in);
        for(i=1;i<a.length;i++)
{
    a[i]=sc.nextInt();
}
System.out.println("Enter the number to search in the array");
search=sc.nextInt();
for(i=1;i<a.length;i++){
 if(a[i]==search){
   System.out.println("The element is at the pos "+i);
    f++;
   break;
 }
}
if(f==0){
    {
        System.out.println("Num not found");
    }
}
 sc.close();
}    
}
