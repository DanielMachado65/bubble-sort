public class Main {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: ");
        ArrayUtils.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("Array after sorting: ");
        ArrayUtils.printArray(array);
    }
}
