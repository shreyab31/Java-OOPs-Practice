package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityEle {
    static int brute(int a[]){
        for (int i = 0; i < a.length; i++) {
            int n=a.length;
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if (count >(n/2))  return a[i];
        }
        return -1;
    }
    static int better(int a[]){
        HashMap<Integer, Integer> map= new HashMap<>();
        int n=a.length;
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if (i.getValue()>n/2) {
                return i.getKey();
            }
    }
    return -1;
}
static int optimal(int a[]){
    int n=a.length;
    int count=0;
    int el=a[0];
    for (int i = 0; i < a.length; i++) {
        if (count==0) {
             count=1;
             el=a[i];
        }
        if (el==a[i]) {
            count++;
        }
        else count--;
    }
    return el;
}
public static void main(String[] args) {
    int[] arr = {4,4,2,4,3,4,4,3,2,4};
    System.out.println(optimal(arr));
}    
}
