package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    static int[][] merge(int intervals[][], int n){
        // Sort the intervals by their start time
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]> merged= new ArrayList<>();
        
    }
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, {8, 10}, {15, 18} };
        int n=intervals.length;
        int[][] result = merge(intervals, n);
        for (int i = 0; i < result.length; i++) {
            System.out.println("[" + result[i][0] + "," + result[i][1]
            + "]");
            }
    }    
}
