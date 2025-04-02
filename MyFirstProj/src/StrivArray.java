import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StrivArray {
    static void Largest(int arr[]){
        int large=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large){
                large=arr[i];
            }
            }
            System.out.println("Large = "+large);
        }
        static void SecondLargest(int arr[]){
            int large=arr[0];
            int secLarge=-1;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>large){
                    secLarge=large;
                    large=arr[i];
                }
                 else if(arr[i]>secLarge&&arr[i]!=large){
                    secLarge=arr[i];
                }
                }
                System.out.println("Large = "+large);
                System.out.println("Second largest= "+secLarge);
            }
    static void SecondSmallest(int arr[]){
            int small=arr[0];
            int secSmallest=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]<small){
                        secSmallest=small;
                        small=arr[i];
                    }
                     else if(arr[i]<secSmallest&&arr[i]!=small){
                        secSmallest=arr[i];
                    }
                    }
                System.out.println("Small = "+small);
                System.out.println("Second Smallest= "+secSmallest);
            }
        static boolean ArrSortedOrNot(int arr[]){
            boolean isSorted=false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    return false;
                }
        }
        return true;
    }
    static int RemoveDuplicates(int a[]){
        int i=0;
        for(int j=1;j<a.length;j++){
                if(a[j]!=a[i]){
                    a[i+1]=a[j];
                    i++;
                }
            }
                return i+1;
            }
        static int RemoveDuplicatesByHashset(int a[]){
            HashSet<Integer> set = new HashSet<>();
            for (int i=0; i<a.length; i++) {
                set.add(a[i]);
            }
            int index=0;
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                a[index++] = it.next();
            }
            int k=set.size();
            return k;
        }
    static void RotateLeftOnce(int a[]){
                int n=a.length;
                int b[]= new int[n];
                 b[n-1]= a[0];
                for(int i=1;i<n;i++){
                     b[i-1]=a[i];
                }
                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[i] + " ");
                }
            }
    static void LeftRotate(int a[]){
                int n=a.length;
                int first= a[0];
                for(int i=0;i<n-1;i++){
                    a[i]=a[i+1];
                }
                a[n-1]=first;
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
            }
    static void LeftRotateByDplaces(int a[], int d){
        int n=a.length;
        d=d%n;
        int temp[]= new int[n];
        for(int i=d;i<n;i++){
            temp[i-d]=a[i];
        }
        for(int i=0;i<d;i++){
            temp[n-d+i]=a[i];
        }
        for (int i = 0; i <n; i++) {
            System.out.print(temp[i] + " ");
        }        
    }
    static void LeftRotateByDplacesByRev(int a[], int d, int n){
        Reverse(a, 0, d-1);
        Reverse(a, d, n-1);
        Reverse(a, 0, n-1);
        for (int i = 0; i < n; i++)
        System.out.print(a[i] + " ");
    }
    static void Reverse(int a[], int start, int end){
        while (start<=end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    static void ShiftZeroToEnd(int a[], int n){
        int j=0;
        int temp[]= new int[n];
        for (int i=0;i<n;i++){
            if(a[i]!=0){
                temp[j]=a[i];
                j++;
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(temp[i] + " ");
        }   
    }
    static void ShiftZeroToEndOptimal(int a[], int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(a[i] + " ");
        }   
    }
    static int LinearSearch(int a[],int n, int key) {
        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    static ArrayList <Integer> UnionBruteByFreq(int a[], int b[], int n, int m){
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union= new ArrayList<>();
        for (int i=0; i<n; i++) {
            freq.put(a[i], freq.getOrDefault(a[i], 0)+1);
        }
        for(int i=0;i<m;i++){
            freq.put(b[i], freq.getOrDefault(b[i], freq.getOrDefault(b[i], 0)+1));
        }
        for(int it: freq.keySet()){
            Union.add(it);
            
        }
        return Union;
    }
    static HashSet<Integer> UnionBySetAddWithoutArrayList(int a[], int b[], int n, int m){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }
        for(int i=0;i<m;i++){
            s.add(b[i]);
        }
        return s;
    }
    static ArrayList<Integer> UnionBySetAdd(int a[], int b[], int n, int m){
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> union= new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }
        for(int i=0;i<m;i++){
            s.add(b[i]);
        }
        for(int it:s){
            union.add(it);
        }
        return union;
    }
    static ArrayList<Integer> UnionOptimal(int a[], int b[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (union.size()==0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size()==0  || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }

        // Add remaining elements from array 'a'
        while (i < n) {
            if(union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from array 'b'
        while (j < m) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
    static ArrayList<Integer> Intersection(int a[],int b[], int n, int m){
        ArrayList<Integer> inter= new ArrayList<>();
        int visited[]= new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]&& visited[j]==0){
                    inter.add(b[j]);
                    break;
                }
                else if (b[j]>a[i]) break;    
            }
        }
        return inter;
    }
    static ArrayList<Integer> IntersectionOptimal(int a[],int b[], int n, int m){
        int i=0, j=0;
        ArrayList<Integer> ans= new ArrayList<>();
        while (i<n && j<m) {
            if(a[i]<b[j]) i++;
        else if(a[i]>b[j])j++;
        else{ ans.add(b[j]); 
            i++; //means both are equal
             j++;
        }
    }
    return ans;
}
    static int maxConsecutiveOnes(int arr[], int n){
        int count =0;
        int count2=0;
        for(int i=0;i<n;i++){
            if (arr[i]==1) {
                count++;
            }
            else{
            count2=count;
            count=0;
            Math.max(count, count2);
        }
    }
        return count2;
    }
    static int numThatAppearsOnceAndTwice(int arr[], int n){
        for (int i = 0; i < n; i++) {
            int num=arr[i];
            int count=0;
            for (int j = 0; j< n; j++) {
            if(arr[j]==num){
                count++;
            }
        }
            if(count==1) return num;
        }
        return -1;
    }
    static HashMap<Integer, Integer> numThatAppearsOnceAndTwiceByHash(int arr[], int n){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        return freq;
    }
    
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* int arr[]= new int[10];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }*/
        int a[]={1,2,3,5,6};
        int b[]={3,3,4,4,5,8};
        int arr[]={1,1,2,3,3,4,4};
        int n= arr.length;
        int m = b.length;
            //Largest(arr);
            //SecondLargest(arr);
            //SecondSmallest(arr); 
            //System.out.println(ArrSortedOrNot(arr));
            //int k= RemoveDuplicates(a);
            int k= RemoveDuplicatesByHashset(arr);
            for(int i=0;i<k;i++){
                System.out.print(arr[i]+" ");
            }
            //RotateLeftOnce(a);
            //LeftRotate(a);
            //LeftRotateByDplaces(a, 3);
            //LeftRotateByDplacesByRev(a, 3, n);
            //ShiftZeroToEnd(a, n);
            //ShiftZeroToEndOptimal(a, n);
            //System.out.println(LinearSearch(a, n, 13));
            //System.out.println(UnionBruteByFreq(a, b, n, m));
            //System.out.println(UnionBySetAdd(a,b,n,m));
            //System.out.println(UnionBySetAddWithoutArrayList(a, b, n, m));
           //System.out.println(UnionOptimal(a, b, n, m));
            //System.out.println(Intersection(a, b, n, m));
            //System.out.println(IntersectionOptimal(a, b, n, m));
            //System.out.println(MissingNum(a, n));
            //System.out.println(maxConsecutiveOnes(arr, n));
            System.out.println(numThatAppearsOnceAndTwice(arr, n));
            //System.out.println(numThatAppearsOnceAndTwiceByHash(arr, n));
        }   
    }