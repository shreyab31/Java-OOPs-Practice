public class insertionsort {
    static int[] insertion(int a[]){
        for (int i = 0; i < a.length; i++) {
            for(int j=i;j>0;j--){
                if (a[j-1]>a[j]) {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    static int[] recursive(int a[], int i, int n){
        if (i==n)return a;
        int j=i;
        while (j > 0 && a[j - 1] > a[j]) {
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
        }
        return recursive(a, i+1, n);
    }
    public static void main(String[] args) {
        int a[]={13, 46, 24, 52, 20, 9};
        //a=insertion(a);
        a=recursive(a, 0, a.length);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
