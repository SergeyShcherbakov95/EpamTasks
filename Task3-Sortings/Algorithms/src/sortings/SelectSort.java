package sortings;

/**
 * Created by sergey on 06/05/16.
 */
public class SelectSort {
    /**
     *  At every step, algorithm finds minimal element in the unsorted part
     *  and adds it to the end of the sorted one.
     *  When unsorted part becomes empty, algorithm stops.
     * @param array
     */
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex])
                    minIndex = j;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
    }
}
