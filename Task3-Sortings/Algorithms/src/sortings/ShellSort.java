package sortings;

/**
 * Created by sergey on 06/05/16.
 */
public class ShellSort {
    /**
     * Initialize the value of step.
     * Divide the list into smaller sub-list of equal interval step.
     * Sort these sub-lists using insertion sort.
     * Repeat until complete list is sorted.
     * @param array
     */
    public static void sort(int[] array){
        for(int n = array.length/2; n >= 1; n /= 2){
            for(int i = n; i < array.length; i++){
                int temp = array[i];

                int j;
                for(j = i - n; (j >= 0) && (temp < array[j]); j -= n){
                    array[j + n] = array[j];
                }

                array[j + n] = temp;
            }
        }
    }
}
