package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {
    static int[] bruteeMine(int a[], int n){
        int b[]=new int[n];
        for (int i=0; i<n; i++) {
            if (a[i]>0){
             b[2*i]=a[i];
            }
            if (a[i]<0) {
                b[2*i+1]=a[i];
            }
        }
        return b;
        }
        static int[] brute(int a[], int n){
            ArrayList<Integer> posnum= new ArrayList<>();
            ArrayList<Integer> negnum= new ArrayList<>();
            for (int i=0; i<n; i++) {
                if (a[i]>0) posnum.add(a[i]);
                else negnum.add(a[i]);     
            }
            for (int i=0; i<n; i++) {
                
                a[2*i]=posnum.get(i);
                a[2*i+1]=negnum.get(i);
        }
        return a;
    }
    static int[] AllNum(int a[], int n){
        ArrayList<Integer> posnum= new ArrayList<>();
        ArrayList<Integer> negnum= new ArrayList<>();
            for (int i=0; i<n; i++) {
                if (a[i]>0) posnum.add(a[i]);
                else negnum.add(a[i]);    
            }
            if (posnum.size()>negnum.size()) {
                for (int i=0; i<negnum.size(); i++) {
                    a[2*i]=posnum.get(i); 
                    a[2*i+1]=negnum.get(i);
                } 
                int index=negnum.size()*2;
                for (int i=negnum.size(); i <posnum.size(); i++) {
                    a[index]=posnum.get(i);;
                    index++;
                }
            }
            else{
                for (int i=0; i<posnum.size(); i++) {
                    a[2*i]=posnum.get(i);
                    a[2*i+1]=negnum.get(i);
                } 
                int index=posnum.size()*2;
                for (int i=posnum.size(); i <negnum.size(); i++) {
                    a[index]=negnum.get(i);;
                    index++;
                } 
            }
    return a;
    }
    
        public static void main(String[] args) {
        int a[]={3,1,-2,-5,2,-4,-4,-5,-6};
        int n=a.length;
        System.out.println(Arrays.toString(AllNum(a, n)));
    }
}
