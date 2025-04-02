public class Butterfly {
    public static void main(String[] args) {
        for(byte i=1;i<=4;i++){
            for(byte j=1;j<=i;j++){
                System.out.print("*");
            }
            for(byte j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(byte j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(byte i=4;i>=1;i--){
            for(byte j=1;j<=i;j++){
                System.out.print("*");
            }
            for(byte j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(byte j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
