import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        int a[]=new int[5];
        int i;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
    }
}