public class OperationsToArray {
    static int[] operations(int arr[]){
        if (arr.length<2) return arr; 
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        //move zeroes
        int i=0;
        int j=i+1;
        while (j<arr.length) {
            if (arr[i]!=0) {
                i++;
                j=i+1;
            }
           else if (arr[j]==0) j++;
            else{
              int temp=arr[i] ;
              arr[i]=arr[j];
              arr[j]=temp;
            }
        }
            return arr;
            } 
            static int[] operationsOpt(int arr[]){
                if (arr.length<2) return arr; 
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i]==arr[i+1]){
                        arr[i]=arr[i]*2;
                        arr[i+1]=0;
                    }
            }
                int index=0;
                for(int i=0;i<arr.length;i++) {
                    if (arr[i]!=0) {
                        arr[index++]=arr[i];
                    }
                }
                while (index<arr.length) { //copy remaining
                    arr[index++]=0;
                }
                return arr;
            }
    public static void main(String[] args) {   
        int arr[]={0,0,0,1,1,0,2,2};
        //int a[]=operations(arr);
        int a[]=operationsOpt(arr);
        for (int i : a) {
            System.out.print(i);
        }
    }
}