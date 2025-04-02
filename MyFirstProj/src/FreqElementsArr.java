public class FreqElementsArr {
    public static void PrintFreq(int arr[]){
        int count=0, visited=-1;
        for(byte i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                visited++;

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,4,6,9,8,6};
    }
}
