public class BubbleSort {

    // Optimized version of Bubble Sort
    public static void bubbleSort(int[] array) {
        boolean swapped;
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Swap two elements in an array
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
