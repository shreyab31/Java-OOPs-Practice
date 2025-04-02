public class ArrayInsertion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int indexToInsertAt = 2;

        // Create a new array with increased size
        int[] newArray = new int[array.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < newArray.length; i++) {
             if (i == indexToInsertAt) {
                newArray[i] = elementToInsert;
            } else if (i < indexToInsertAt) {
                newArray[i] = array[i];
            } else {
                newArray[i] = array[i - 1];
            }
        }

        // Print the new array
        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.println(num);
        }
    }
}
