public class Main {

    // Function to print an array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: ");
        printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("Array after sorting: ");
        printArray(array);
    }
}
