public class HollowRhombus {
    public static void main(String[] args) {
        byte n=5;
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=(n-i);j++){

            System.out.print(" ");
            }
            //hollow rec
            for(byte j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
    }
}
}