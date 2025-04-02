public class Diamond {
    public static void main(String[] args) {
        byte n=4;
        //spaces
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(byte j=1;j<=2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(byte i=n;i>=1;i--){
            for(byte j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(byte j=1;j<=2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
