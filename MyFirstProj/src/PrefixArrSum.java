public class PrefixArrSum {
    public static void prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        prefix[0] = arr[0];
        System.out.print("prefix array= [");
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
            System.out.print(prefix[i]);
            if(i!=prefix.length-1){
                System.out.print(",");
            }
            else{
                System.out.print("]");
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                 sum = start == 0 ? prefix[0] : prefix[end] - prefix[start - 1];
                 if(max<sum){
                    max=sum;
                }
                if(min>sum){
                    min=sum;
                }
            }
        }
        System.out.println("Max sum= "+max);
         System.out.println("Min sum= "+min);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefixSum(arr);
    }
}
