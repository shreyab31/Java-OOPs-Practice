package Array;
public class stockBuySell {
    static int brute(int a[]){
        int maxpro=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j]>a[i]) {
                    maxpro=Math.max(a[j]-a[i], maxpro);
                }
            }
        }
        return maxpro;
    }
    static int optimal(int a[]){
        int maxpro=0;
        int minprice=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            minprice=Math.min(minprice, a[i]);
            maxpro=Math.max(maxpro, a[i]-minprice);
        }
        return maxpro;
    }
    public static void main(String[] args) {
       int arr[] = {7,1,5,3,6,4};

       System.out.println(optimal(arr));
    }
}
