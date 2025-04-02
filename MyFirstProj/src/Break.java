public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
          }
            System.out.println("Loop ends here");
        }
    }
