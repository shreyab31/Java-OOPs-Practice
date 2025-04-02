import java.util.HashSet;

public class longestFibonacci {
    static int longest(int arr[]){
        int n = arr.length;
        HashSet<Integer> set=new HashSet<>();
       for (int i : arr) {
        set.add(i);
         }
        int count=0;
        int maxlen=0;
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1;j<n;j++){
                int num1= arr[i];
                int num2=arr[j];
                count=2;
            while (set.contains(num1+num2)) {
                int next=num1+num2;
                num1=num2;
                num2=next;
                count++;
            }
            maxlen=Math.max(maxlen, count);
            }
    }
    return maxlen >= 3 ? maxlen : 0; 
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(longest(arr));
    }
}