public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int arrayLength = array.length;

        for (int currentIteration = 0; currentIteration < arrayLength - 1; currentIteration++) {
            boolean swapped = performSinglePass(array, arrayLength, currentIteration);
            if (!swapped)
                break;
        }
    }

    private static boolean performSinglePass(int[] array, int arrayLength, int currentIteration) {
        boolean swapped = false;
        int lastUnsortedIndex = arrayLength - currentIteration - 1;
        for (int i = 0; i < lastUnsortedIndex; i++)
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                swapped = true;
            }

        return swapped;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
