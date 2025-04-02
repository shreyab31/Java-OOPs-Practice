import java.util.Scanner;
public class SumOdd {
    public static void main(String[] args) {
        int num, i, sum=0;
        System.out.println("Enter the num");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        {
            for(i=0;i<=num;i++)
              if(i%2!=0){
            sum=sum+i;
        }
    }
        System.out.println("sum of first "+num+" numbers= "+sum);
        sc.close();
    }
}
