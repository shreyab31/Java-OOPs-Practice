public class InvHalfPyrNum {
    public static void main(String[] args) {
        byte n=5;
        /*byte num=1;
        for(byte i=n;i>=1;i--){
            for(byte j=i;j>=1;j--)
            {
                System.out.print(num++);

            }
            num=1;
            for(byte j=1;j<=n-i;j++);
            {
                System.out.print(" ");
            }
            System.out.println();
        }*/
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
