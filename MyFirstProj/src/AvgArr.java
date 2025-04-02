import java.util.Scanner;
public class AvgArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the students");
        int n=sc.nextInt();
        float sum=0,avg;
        float arr[]= new float[n];
        System.out.println("Enter the physics marks of "+n+" students");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
            sum=sum+arr[i];
        }
        avg=(sum)/n;
        System.out.println("The average of "+n+" students is: "+avg);

    }    
}
