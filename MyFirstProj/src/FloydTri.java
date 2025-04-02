public class FloydTri {
    public static void main(String[] args) {
        byte num=1;
        for(byte i=1;i<=5;i++){
            for(byte j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
