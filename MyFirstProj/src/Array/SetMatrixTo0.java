package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixTo0 {
    static void Brute(){
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans= zeroMatrix(matrix,n,m);
        
        System.out.println("The final matrix is");
        for (ArrayList<Integer>row:ans) {
            for(Integer ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (matrix.get(i).get(j)==0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (matrix.get(i).get(j)==-1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for (int i=0; i<n; i++) {
            if (matrix.get(i).get(j)!=0) {
                matrix.get(i).set(j, -1);
            }
        }
}
    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
    for (int j=0; j<m; j++) {
        if (matrix.get(i).get(j)!=0) {
            matrix.get(i).set(j, -1);
        }
    }
}
static int[][] setZero(int a[][], int n, int x, int y){
   for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (j==x|| j==y) {
                a[i][j]=0;
            }
   }
}
return a;
}



    static void Better(){
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        System.out.println(zeroMatrixBetter(matrix, n, m));
    }
    static ArrayList<ArrayList<Integer>> zeroMatrixBetter(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row= new int[n];
        int[] col= new int[m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (matrix.get(i).get(j)==0) {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (row[i]==1||col[j]==1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
    static ArrayList<ArrayList<Integer>> Optimal() {
        ArrayList<ArrayList<Integer>> matrix= new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
       // System.out.println(zeroMatrixBetter(matrix, n, m));
        //int[] row= new int[n];--> matrix[...][0];
        //int[]col= new int[m];---> matrix[0][...];
        int col0=1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (matrix.get(i).get(j)==0) {
                    //mark ith row
                    matrix.get(i).set(0,0);
                    
                    //mark jth col
                    if (j!=0) {
                        matrix.get(0).set(j, 0);
                    }
                        else{ 
                        col0=0;
                    }
                }
            }
        }
        //Mark with 0 from (1,1) to (n-1, m-1):
        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                if (matrix.get(i).get(j)!=0) {
                   //check for row and col
                   if (matrix.get(i).get(0)==0||matrix.get(0).get(j)==0) {
                    matrix.get(i).set(j, 0);
                   }
                   
                }
            }
        }
        if (matrix.get(0).get(0)==0) {
            for (int j=0; j<m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0==0) {
            for(int i=0; i<n; i++){
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        //Brute();
        //Better();
        System.out.println(Optimal());
    }
}
