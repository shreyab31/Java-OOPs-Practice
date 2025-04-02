import java.util.*;

public class Hashing {
    public static void HashingArr(){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int hash[]= new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]=hash[arr[i]]+1;
        }
        System.out.println("entering hash values");
        int q=sc.nextInt();
        while(q--!=0){
            int num=sc.nextInt();
            System.out.println(hash[num]);
        }
    }
    public static void HashingString(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        int hash[]= new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']+=1;
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q--!=0){
            char c=sc.next().charAt(0);
            System.out.println(c+"= "+hash[c-'a']);
        }
    }
    public static void HashMap(){
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key))freq=mp.get(key);
            freq++;
            mp.put(key, freq);
        }                           //time complexity- log(n) both storing and fetching
        int q;
        q=sc.nextInt();
        while(q--!=0){
            int num;
            num=sc.nextInt();
            if(mp.containsKey(num))System.out.println(mp.get(num));
            else System.out.println(0);
        }
    }
    class ArrFreq{
    public static void ArrayFreq(){
        int arr[]={1,2,3,4,1,2,4,7};
        int n=arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int arr[], int n){
        boolean visited[]= new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true) continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }

    }
}
    
    public static void main(String[] args) {
        //HashingArr();
        //HashingString();
        //HashMap();
        ArrFreq ob= new ArrFreq();
        ob.ArrayFreq();
    }
}