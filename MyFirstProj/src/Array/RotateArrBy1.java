package Array;
public class RotateArrBy1 {
    static int [] brute(int a[]){
        int temp[]= new int[a.length];
        int n=a.length;
        int j=0;
        temp[j++]=a[n-1];
        for (int i = 0; i < n-1; i++) {
                temp[j++]=a[i];
        }
        return temp;
    }
    static int [] optimal(int a[]){
        int n=a.length;
        int el=a[n-1];
        for (int i =0; i <n-1; i++) {
            a[i] = a[i+1];
        }
        a[0]=el;
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5}; 
        a=brute(a);
        //a=optimal(a);
        for (int i : a) {
            System.out.print(i);
        }
    }
}

