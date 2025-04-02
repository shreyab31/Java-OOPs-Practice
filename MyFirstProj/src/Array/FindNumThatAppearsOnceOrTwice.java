package Array;

import java.util.HashMap;
import java.util.Map;

public class FindNumThatAppearsOnceOrTwice {
     static int AppearedOnce(int arr[], int n){
        for (int i=0; i<n; i++) {
          int num=arr[i];
          int count=0;
          for(int j=0;j<n;j++){
            if (arr[j]==num) {
            count++;
            } 
        }
        if(count==1)return num;
    }
    return -1;
}
 static int AppearedOnceByHashing(int arr[], int n){
    int max=arr[0];
    for (int i=0; i<n; i++) {
        max=Math.max(max, arr[i]);
    }
    int hash[]=new int[max+1];
    for (int i=0; i<hash.length; i++) {
        hash[arr[i]]++;
    }
    for (int i=0; i<n; i++) {
        if (hash[arr[i]]==1) {
            return arr[i];
        }
    }
    return -1;
 }
 static int AppearedOnceByHashMap(int arr[], int n){
    HashMap<Integer, Integer> map= new HashMap<>();
    for (int i=0; i<n; i++) {
        int value=map.getOrDefault(arr[i], 0);
        map.put(arr[i], value+1);
        //mpp.put(a[i], mpp.getOrDefault(a[i], 0)+1); you can also use this instead of value variable 
    }
    for(Map.Entry<Integer,Integer> it: map.entrySet()){
        if (it.getValue()==1) {
            return it.getKey();
        }
    }
    return -1;
 }
 static int AppearedOnceOptimalByXOR(int arr[], int n){
    int xor=0;
    for (int i=0; i<arr.length; i++) {
        xor=xor^arr[i];
    }
    return xor;
 }
    public static void main(String[] args) {
       int arr[]={1,1,2,2,3,4,4};
       int n=arr.length;
        //System.out.println(AppearedOnce(arr, n));
        //System.out.println(AppearedOnceByHashing(arr, n));
        //System.out.println(AppearedOnceByHashMap(arr, n));
        System.out.println(AppearedOnceOptimalByXOR(arr, n));
    }
}