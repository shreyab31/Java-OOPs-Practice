package Array;

import java.util.Arrays;

public class RotateMatrixBy90 {
    static void brute(int[][] matrix, int n){
        for (int j=0; j<n; j++) {
            for (int i=n-1; i>=0; i--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] bruteStriv(int[][]matrix, int n){
        int[][]roated=new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                roated[j][n-i-1]=matrix[i][j];
            }
        }
        return roated;
    }
    static int[][] Optimal(int[][]matrix, int n){
        for (int i=0; i<n; i++) {
            for (int j=i; j<matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) { //because for swpping we need to only run half
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        //brute(matrix,n);
        //System.out.println(Arrays.deepToString(bruteStriv(matrix, n)));
        System.out.println(Arrays.deepToString(Optimal(matrix, n)));
    }
}
