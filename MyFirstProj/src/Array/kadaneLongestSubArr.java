package Array;
public class kadaneLongestSubArr {
    static int brute(int a[], int n){
        int sum=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                 sum=0;
                for (int k = i; k<=j; k++) {
                    sum+=a[k];
                }
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    static int better(int a[], int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                max=Math.max(sum, max);
        }
    }
    return max;
    }
    static int optimal(int a[], int n){
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(sum==0) start=i;
            sum+=a[i];
           if (sum>max) {
            ansStart=start;
            ansEnd=i;
            max=sum;
        }
           if(sum<0) sum=0;
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("] ");
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(optimal(arr, arr.length));
    }
}
