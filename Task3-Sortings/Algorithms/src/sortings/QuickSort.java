package sortings;

/**
 * Created by sergey on 07/05/16.
 */
public class QuickSort {
    /**
     * We take the value of the middle element , but it can be any value, which is in range of sorted values.
     * Rearrange elements in such a way,
     * that all elements which are lesser than the middle element go to the left part of the array
     * and all elements greater than the middle element, go to the right part of the array.
     * Values equal to the middle element can stay in any part of the array.
     * An array may be divided in non-equal parts.
     * Sort both parts. Apply quick sort algorithm recursively to the left and the right parts.
     * @param array
     */
    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int startIndex, int endIndex){
        if(startIndex >= endIndex)
            return;
        int currentIndex = startIndex - (startIndex - endIndex)/2;
        int i = startIndex, j = endIndex;

        while(i < j) {
            while (i < currentIndex && (array[i] <= array[currentIndex])) {
                i++;
            }
            while (j > currentIndex && (array[currentIndex] <= array[j])) {
                j--;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == currentIndex)
                    currentIndex = j;
                else if (j == currentIndex)
                    currentIndex = i;
            }
        }

        sort(array, startIndex, currentIndex);
        sort(array, currentIndex + 1, endIndex);
    }
}
