import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArr = {11, 12, 22, 25, 34, 64, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] sortedArr = {};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {1};
        int[] sortedArr = {1};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sortedArr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] sortedArr = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(sortedArr, arr);
    }
}
