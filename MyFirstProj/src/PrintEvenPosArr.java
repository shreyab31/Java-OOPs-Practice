public class PrintEvenPosArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.print("Even position= ");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nOdd position= ");
        for(int i=1;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
    }
}
}