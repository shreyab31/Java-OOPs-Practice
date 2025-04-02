public class RevArr{
    public static void swap(int l, int r, int arr[]){
    int temp=arr[l];
    arr[l]=arr[r];
    arr[r]=temp;
}

public static void reverseArrayDoubleArg(int l,int r,int arr[]){
    if(l>=r) return;
    swap(l,r,arr);
    reverseArrayDoubleArg(l+1,r-1,arr);
}
public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
    //int n=sc.nextInt();
    int arr[]={1,2,3,4,5};
    int l=0;
    int r=arr.length-1;
    reverseArrayDoubleArg(l,r,arr);
    for(int i=l;i<=r;i++){
        System.out.print(arr[i]+" ");
    }
}
}