package sortings;

/**
 * Created by sergey on 06/05/16.
 */
public class InsertionSort {
    /**
     * At every step, algorithm takes first element in the unsorted part
     * and inserts it to the right place of the sorted one.
     * When unsorted part becomes empty, algorithm stops.
     * @param array
     */
    public static void sort(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j;
            for(j = i - 1; (j >= 0) && (temp < array[j]); j--) {
                array[j+1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}
