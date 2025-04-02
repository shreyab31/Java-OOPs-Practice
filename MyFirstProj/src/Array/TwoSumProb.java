package Array;

import java.util.HashMap;

public class TwoSumProb {
    static void BruteBy2Loops(int a[], int n, int k){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                if (a[i]+a[j]==k) {
                    System.out.println("yes");
                    System.out.println(i+","+j);
                    break;
                }
            }
        }
    }
    static int[] BetterByHashing(int a[], int n, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            int moreNeeded=k-a[i];
            if(map.containsKey(moreNeeded)){
                System.out.println("Yes");
                ans[0]=map.get(moreNeeded);
                ans[1]=i; 
                return ans;
            }   
            map.put(a[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,6,5,8,11};
        int n=a.length;
        //BruteBy2Loops(a, n, 14);
        int ans[]=BetterByHashing(a, n, 14);
        System.out.println(ans[0] +" " + ans[1]);
    }
}
