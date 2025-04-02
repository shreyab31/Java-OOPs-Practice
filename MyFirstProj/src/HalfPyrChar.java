public class HalfPyrChar {
    public static void main(String[] args) {
        
        for(byte i=1;i<=4;i++){
            char ch='A';
            for(byte j=1;j<=i;j++){
                
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
