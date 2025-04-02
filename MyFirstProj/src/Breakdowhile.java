public class Breakdowhile {
    public static void main(String[] args) {
        int i=0;
        do
        {
        System.out.println(i);
        System.out.println("Java");
        i++;
        if(i==12)
        {
            System.out.println("Ending the loop");
            break;
        }
        }while(i<50);
        System.out.println("Loop ends here");
    }
}
