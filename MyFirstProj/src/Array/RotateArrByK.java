package Array;
public class RotateArrByK {
    static int[] brute(int a[], int n, int k){
        if (n == 0) return 0;
        k=k%n;
        if (k > n) return 0;
        int temp[]=new int[k];
        for (int i = n-k; i < a.length; i++) {
            temp[i-n+k]=a[i];
        }
        for (int i = n-k-1; i>=0; i--) {
            a[i+k]=a[i];
        }
        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
          }
        return a;
    }
    static int[] better(int a[], int n, int k){
        if (k == 0) return a;
        k=k%n;
        int temp[]=new int[k];
        for (int i = 0; i < k; i++) {
            temp[i]=a[i];
        }
        for (int i =0; i <n-k; i++) {
            a[i]=a[i+k];
        }
        for (int i = n-k; i < n; i++) {
            a[i]=temp[i-n+k];
        }
        return a;
    }
    static int[] Reverse(int a[], int start, int end){
        while(start<end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
        }
        return a;
    }
    static int[] optimal(int a[], int n, int k){
        k=k%n;
        if(k==0) return a;
        Reverse(a,0,n-1);
        Reverse(a, 0, k-1);
        Reverse(a, k, n-1);
        return a;
    }
    static int[] optimalVS(int a[], int n, int k){
        int[] b = new int[k];
        for(int i = 0; i < n; i++){
            b[(i + k) % n] = a[i];
            }
            return b;
        }
public static void main(String[] args) {
 int a[]  ={1,2,3,4,5};
    //a=optimalVS(a, a.length, 2);
    //a=brute(a, a.length, 3);
    //a=better(a, a.length, 3);
    a=optimal(a, a.length, 3);
    for (int i : a) {
    System.out.print(i); 
    }
}    
}