public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            boolean swapped = performSinglePass(array, arrayLength, i);
            if (!swapped) {
                break;
            }
        }
    }

    private static boolean performSinglePass(int[] array, int arrayLength, int passIndex) {
        boolean swapped = false;
        for (int j = 0; j < arrayLength - passIndex - 1; j++) {
            if (array[j] > array[j + 1]) {
                swap(array, j, j + 1);
                swapped = true;
            }
        }
        return swapped;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
