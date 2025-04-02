public class Armstrong {
    static boolean ArmstrongOrNot(int n){
        int temp=0;
        int num=n;
        while (n>0) {
            int digit=n%10;
             n=n/10;
             int pow = (int) Math.log10(num) + 1;  // this to calculate power if the num is of 4 digits
              temp=temp+(int)Math.pow(digit, pow);
        }
        if (temp==num) return true;
       else return false;
    }
    public static void main(String[] args) {
        System.out.println(ArmstrongOrNot(9474));
    }
}
