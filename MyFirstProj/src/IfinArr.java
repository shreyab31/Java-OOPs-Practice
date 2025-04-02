public class IfinArr {
    public static void main(String[] args) {
    float arr[]={1.2f,4.4f, 7.2f, 9.1f, 11.2f};        
    float num=1.2f;
    boolean isinArray= false;
    for(float element:arr)
    {
        if(num==element)
        {
            isinArray=true;
            break;
        }
    }
    if(isinArray){
        System.out.println("The num is in array");
    }
    else{
        System.out.println("The num is not in array");
    }
    }
}
