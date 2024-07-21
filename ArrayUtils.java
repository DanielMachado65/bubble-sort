public class ArrayUtils {

    // Function to print an array
    public static void printArray(int[] array) {
        System.out.println(arrayToString(array));
    }

    // Convert array to a formatted string
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int element : array) {
            result.append(element).append(" ");
        }
        return result.toString().trim();
    }
}
