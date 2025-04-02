import java.util.Scanner;
public class Add2Arr {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int mat1[][] = new int[2][3];
    int mat2[][] = new int[2][3];
    int result[][] = new int[2][3];
    int i,j;
    System.out.println("Enter the elements of 1st matrice");
    for(i=0;i<mat1.length;i++){
        for(j=0;j<mat1[i].length;j++)
        {
            mat1[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the elements of 2nd matrice");
    for(i=0;i<mat2.length;i++){
        for(j=0;j<mat2[i].length;j++)
        {
            mat2[i][j]=sc.nextInt();
        }
    }
    System.out.println("The addition of two matrices is");
    for(i=0;i<mat1.length;i++)
    {
        for(j=0;j<mat1[i].length;j++)
       {
        result[i][j]= mat1[i][j] + mat2[i][j];
        System.out.print(result[i][j]+" ");
       } 
       System.out.println();
    }

}    
}
