public class ArrReverse {
    public static void Rev(int num[]){
        int start=0, end=num.length-1;
        while(start<end){
            int temp= num[end];
            num[end]= num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Rev(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
     
    }
}
