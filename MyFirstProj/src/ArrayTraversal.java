import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Using streams
        System.out.println("Using streams:");
        Arrays.stream(array).forEach(System.out::println);
    }
}
