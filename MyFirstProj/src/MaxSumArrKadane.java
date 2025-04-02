import java.math.*;
public class MaxSumArrKadane {
    public static void Kadane(int arr[]){
        int CurrentSum=0;
        int Maxsum= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            CurrentSum=CurrentSum+arr[i];
            if(CurrentSum<0){
                CurrentSum=0;
            }
            Maxsum=Math.max(Maxsum, CurrentSum);
            if (Maxsum == 0) {
                // If maxSum is 0, it means all elements are negative,
                // so return the maximum element in the array as the maximum sum
                Maxsum = Integer.MIN_VALUE;
                for (int j = 0; j < arr.length; j++) {
                    Maxsum = Math.max(Maxsum, arr[j]);
                }
            }
    }    
    System.out.println("Max sum= "+Maxsum);
}
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadane(arr);
    }
}
