package Array;

import java.util.HashMap;

public class MajorElement {
    static int bruteBy2Loops(int a[], int n){
        int count=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (a[i]==a[j]) {
                    count++;
                    if (count>n/2) {
                        return a[i];
                    }
                }
            }
        }
        return -1;
    }
    static int betterByHashing(int a[], int n){
        HashMap<Integer,Integer> freq= new HashMap<>();
        for (int i=0; i<n; i++) {
            freq.put(a[i], freq.getOrDefault(a[i], 0)+1);
            if(freq.get(a[i])>n/2){
                return a[i];
            }
        }
        return -1;
    }
    static int OptimalMooreVotingAlgo(int a[], int n){
        int count=0;
        int element=0;
        for (int i = 0; i < a.length; i++) {
         if (count==0) {
            count=1;
            element=a[i];
         }
         else if (a[i]==element) {
            count++;
         }   
        else count--;
        }
        int count1=0;
        for (int i = 0; i <n; i++) {
            if (a[i]==element) {
                count1++;
            }
            if (count1>n/2) return a[i];
        }
        return element;
}
    public static void main(String[] args) {
        int a[]={2, 2, 1, 1, 1, 2, 2};
        int n=a.length;
        //System.out.println(bruteBy2Loops(a, n));
        //System.out.println(betterByHashing(a, n));
        System.out.println(OptimalMooreVotingAlgo(a, n));
    }
}
