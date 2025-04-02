package Array;
public class KadaneLongestSubArrSum {
    static int bruteBy3Loops(int a[], int n){
        int maxsum=Integer.MIN_VALUE;
        for (int i=0; i <n; i++) {
            for (int j=i; j<n; j++) {
                int sum=0;
                for (int k=i; k<=j;k++) {
                    sum+=a[k];
                }
                 maxsum=Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
    static int betterBy2Loops(int a[], int n){
        int maxsum=Integer.MIN_VALUE;
        for (int i=0; i <n; i++) {
            int sum=0;
            for (int j=i; j<n; j++) {
                    sum+=a[j];
                    maxsum=Math.max(maxsum, sum);
                }
            }
            return maxsum;
        }
        static int Optimal(int a[], int n){
            int max=Integer.MIN_VALUE;
            int sum=0;
            for (int i=0; i <n; i++) {
                        sum+=a[i];
                        if (sum>max) {
                            max=sum;
                        }
                        if (sum<0) {
                            sum=0;
                        }
                    }
                return max;
            }
            static int maxSubArrSum(int a[], int n){
                int max=Integer.MIN_VALUE,  start=0, sum=0, ansStart=-1, ansEnd=-1;
                for (int i=0; i<n; i++) {
                    if (sum==0) {
                        start=i;
                    }
                    sum+=a[i];
                    if (sum>max) {
                        max=sum;
                        ansStart=start;
                        ansEnd=i;
                    }
                    if (sum<0) {
                        sum=0;
                    }
                }
                System.out.print("The subarray is: [");
                for (int i = ansStart; i <= ansEnd; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.print("]");
                return max;
            }
    public static void main(String[] args) {
        int a[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=a.length;
        //System.out.println(bruteBy3Loops(a,n));
        //System.out.println(betterBy2Loops(a, n));
        //System.out.println(Optimal(a, n));
        System.out.println("\nThe maximum subarray sum is: " +maxSubArrSum(a, n));
    }
}
