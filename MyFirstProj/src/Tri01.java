public class Tri01 {
    public static void main(String[] args) {
        for(byte i=1;i<=5;i++){
            for(byte j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
