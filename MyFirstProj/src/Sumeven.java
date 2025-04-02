import java.util.Scanner;
public class Sumeven {
    public static void main(String[] args) {
        int sum=0, i=0, n;
        System.out.println("Enter the value of n");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(i<n)
        { 
            if(i%2==0)
            {
                sum=sum+i;
        }   
         i++;  
    }
     System.out.println(sum);
    sc.close();
}
}

