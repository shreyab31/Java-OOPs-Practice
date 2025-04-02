package Array;
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
     static ArrayList<Integer> brute(int a[], int n){
        int count=0;
        ArrayList<Integer> leader= new ArrayList<>();
        for (int i=0; i<n; i++) {
            count=0;
            for (int j =i+1; j <n; j++) {
                if (a[i]<a[j]) {
                    count++;
                    break;
                }
            }
            if(count==0) leader.add(a[i]);
        }
        return leader;
     }
     static ArrayList<Integer> bruteStriv(int a[], int n){
        ArrayList<Integer> leader= new ArrayList<>();
        for (int i=0; i<n; i++) {
            boolean isLeader=true;
            for (int j =i+1; j <n; j++) {
                if (a[i]<a[j]) {
                   isLeader=false;
                    break;
                }
            }
            if(isLeader==true) leader.add(a[i]);
        }
        return leader;
     }
     static ArrayList<Integer> optimal(int a[], int n){
        ArrayList<Integer> leader= new ArrayList<>();
        int max=a[n-1];
        leader.add(a[n-1]);
        for (int i=n-2; i>=0; i--) {
            if (a[i]>max) {
                leader.add(a[i]);
                max=a[i];
            }
        }
        return leader;
     }
    public static void main(String[] args) {
     int a[]={10, 22, 12, 3, 0, 6};
     int n=a.length;
     //System.out.println(brute(a, n));
     ArrayList<Integer> leader= optimal(a, n);
     System.out.println(leader);
     Collections.sort(leader, Collections.reverseOrder());   
     System.out.println(leader);
    }
}
