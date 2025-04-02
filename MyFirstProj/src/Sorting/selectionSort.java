public class selectionSort { 
    static int[] brute(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j < a.length; j++) {
                 if(a[j]<a[min]) min=j;
                }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int arr[]=brute(a);
        for (int i : arr) {
            System.out.print(i);
    }
}
}