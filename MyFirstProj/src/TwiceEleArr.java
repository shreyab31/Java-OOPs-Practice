public class TwiceEleArr {
    public static boolean Check(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        System.out.println(Check(arr));
    }
    }

