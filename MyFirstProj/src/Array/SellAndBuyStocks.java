package Array;

public class SellAndBuyStocks {
    static int MaxProfitBrute(int a[], int n){
        int maxProfit=0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (a[j]>a[i]) {
                    maxProfit=Math.max(a[j]-a[i], maxProfit);
                }
            }
        }
        return maxProfit;
    }
    static int MaxProfitOptimalStriv(int a[], int n){
        int maxProfit=0, min=a[0], cost=0;
        for (int i=1; i < n; i++) {
            cost=a[i]-min;
            maxProfit=Math.max(maxProfit, cost);
            min=Math.min(min, a[i]);
        }
        return maxProfit;
    }
    static int MaxProfitOptimal(int a[], int n){
        int min=a[0];
        int maxProfit=0;
        for (int i=0; i<n; i++) {
               min=Math.min(a[i], min); 
               maxProfit=Math.max(maxProfit, a[i]-min);
            }
            return maxProfit;
        }
    static int MyApproach(int a[], int n){
        int maxProfit=Integer.MIN_VALUE;
        int min=0, day=0;        
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min=a[i];
                day=i;
            }
            int profitPossible=a[i]-min;
            maxProfit=Math.max(maxProfit, profitPossible);
        }
        System.out.println("Buy day="+day);
        return maxProfit;
    }
    public static void main(String[] args){
        int a[]={7,1,5,3,6,4};
        int n=a.length;
        //System.out.println(MaxProfit(a, n));
        //System.out.println(MyApproach(a, n));
        //System.out.println(MaxProfitOptimalStriv(a, n));
        System.out.println(MaxProfitBrute(a, n));
    }
}
