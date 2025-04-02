import java.util.Scanner;
class ArrSum{
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the arr");
        int i,sum=0,n;
          int a[]=new int[25];
        System.out.println("Enter the array limit");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}