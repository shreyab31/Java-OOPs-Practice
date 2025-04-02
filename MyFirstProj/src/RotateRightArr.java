public class RotateRightArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=3; //determines the number of times array should be rotated
        System.out.print("Original Array= ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+", ");
            }
            for( int i = 0; i < n; i++){      
                int last,j;
                last=arr[arr.length-1];
                for(j=arr.length-1;j>0;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]=last;
            }
            System.out.println();
            System.out.print("Array after rotation ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+", ");
            }

    }
}
