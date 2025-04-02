public class DuplicateEleArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,6,3,5};
        System.out.print(" Duplicate Elemets= ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
