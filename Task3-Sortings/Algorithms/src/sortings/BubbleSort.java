package sortings;

/**
 * Created by sergey on 06/05/16.
 */
public class BubbleSort {
    /**
     * Compare each pair of adjacent elements from the beginning of an array and, if they are in reversed order, swap them.
     * If at least one swap has been done, repeat previous step.
     * @param array
     */
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++) {
            boolean sorted = false;
            for (int j = 0; j < (array.length - i - 1); j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = true;
                }
            }
            if(!sorted)
                break;
        }
    }

}
