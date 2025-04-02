public class FrequencyEleArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,1,5,6,3,5,7,8};
        int [] fr = new int [arr.length];
            int count=1, visited=-1;
            for(int i=0;i<arr.length;i++){
                for(int j=1+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        fr[j]=visited;
                    }
                }
                if(fr[i]!=visited){
                    fr[i]=count;
                }
            }
                System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < arr.length; i++){  
            if(arr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
}
            


