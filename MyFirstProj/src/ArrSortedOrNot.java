import java.util.*;
public class ArrSortedOrNot {
public static void main(String[] args) {
    int a[]=new int[5];
    Scanner sc= new Scanner(System.in);
    boolean isSorted=true;
     for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }

    for(int i=0;i<a.length - 1;i++)
    {
        if(a[i]>a[i+1]){
            isSorted=false;
            break;
        }
    }
    if(isSorted==true){
        System.out.println("SORTED");
    }
    if (isSorted==false) {
        System.out.println("UNSORTED"); 
    }
}    
}
