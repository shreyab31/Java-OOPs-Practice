public class SolidRhombus {
    public static void main(String[] args) {
        for(byte i=1;i<=5;i++){
            for(byte j=1;j<=(5-i);j++){
                System.out.print(" ");
            }
            for(byte j=1;j<=5;j++){
                System.out.print("*");
            }
         System.out.println();   
        }
    }
}
