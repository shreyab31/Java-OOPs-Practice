import java.util.Scanner;
public class MultidArray {
 public static void main(String[] args) {
    int [][]flats;
    Scanner sc= new Scanner(System.in);
    flats= new int[2][3];
    System.out.println("Enter the elements of array");
    for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
             System.out.print("Enter value for flats[" + i + "][" + j + "]: ");
             flats[i][j]=sc.nextInt();
    }
}
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
    }
    sc.close();
 }    
}
