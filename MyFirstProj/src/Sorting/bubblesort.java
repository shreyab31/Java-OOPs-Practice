public class bubblesort {
    static int[] brute(int a[]){
        int n=a.length;
        while(n>0){
        for (int i = 0; i <n-1; i++) {
            if (a[i]>a[i+1]) {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        n--;
    }
        return a;
    }
    static int[] brutestriv(int a[]){
        int n=a.length;
        for (int i =n-1; i>=0; i--) {
            for (int j = 0; j <i; j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    static int[] optimal(int a[]){
        int n=a.length;
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <i; j++) {
                if (a[j] > a[j + 1]) {
                int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    didSwap=1;
            }
    }
    if (didSwap==0) break;        
    }
    return a;
}   
    static int[] recursiveBrute(int a[], int n){
        if (n==1) return a;
        for (int j = 0; j<n-1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
            }
        } 
        return recursiveBrute(a, n-1);
    }
    static int[] recursiveopti(int a[], int n){
        if (n==1) return a;
        int didSwap=0;
        for (int j = 0; j<n-1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    didSwap=1;
            }
        } 
        if (didSwap==0) return a;
        return recursiveopti(a, n-1);
    }

    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        //int arr[]=brute(a);
        //int arr[]=brutestriv(a);
        //int arr[]=optimal(a);
        int arr[]=recursiveBrute(a, a.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}