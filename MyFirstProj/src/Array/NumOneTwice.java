package Array;

import java.util.HashMap;

public class NumOneTwice {
    static int bruteMine(int a[]){
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if (i!=j&&a[i]==a[j]) {
                    count++;
                    break;
                }
            }
            if (count==0) return a[i];
        }
        return -1;
    }
    static int brute(int a[]){
        for (int i = 0; i < a.length; i++) {
            int num=a[i];
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if (a[i]==a[j]) {
                    count++;
                }
                if(count==1) return num;
        }
    }
    return -1;
}
    static int betterHashing(int a[]){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            max=Math.max(max, a[i]);
        }
        int hash[]=new int[max+1];
        for (int i = 0; i < hash.length; i++) {
            hash[a[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[a[i]]==1) {
                return a[i];
            }
        }
        return -1;
    }
    static int betterHashMap(int a[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
    }
    /*for (int i = 0; i < a.length; i++) {
        if (map.get(a[i])==1) {
            return a[i];
        }*/
        for (int i : a) {
            if (map.get(i)==1) {
                return i;
            }
        }
    return -1;
}
    static int optimalXOR(int a[]){
        int xor=0;
        for (int i = 0; i < a.length; i++) {
            xor^=a[i];
    }
    return xor;
}
    public static void main(String[] args) {
        int a[]={4, 5, 1, 5, 4};
        System.out.println(optimalXOR(a));

    }

}