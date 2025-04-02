class send0ToLast {
    public static int[] zero(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int j=i;
                while(arr[j]==0){
                    j++;
                }
                arr[i]=arr[j];
                arr[j]=0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,0,3,0,0,5,0,6};
        zero(arr);
    }
}