public class PrintSubArr {
    public static void SubArr(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    if(k!=j){
                        System.out.print(", ");
                    }
                    sum=sum+arr[k];
                        }
                        if(sum>max){
                            max=sum;
                        }
                        if(min>sum){
                            min=sum; 
                        }
                System.out.print("] -> sum= "+sum);
                System.out.println();
            }
        }
        System.out.println("Max sum= "+max);
            System.out.println("Min sum= "+min);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SubArr(arr);
    }
}
