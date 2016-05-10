package sortings;

/**
 * Created by sergey on 07/05/16.
 */
public class MergeSort {
    /**
     * Merge sort keeps on dividing the list into equal halves until it can no more be divided.
     * If it is only one element in the list, it is sorted.
     * Then merge sort combines smaller sorted lists keeping the new list sorted too.
     * @param array
     */
    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int startIndex, int endIndex){
        if(startIndex == endIndex)
            return;

        int currentIndex = startIndex - (startIndex - endIndex)/2;
        sort(array, startIndex, currentIndex);
        sort(array, currentIndex + 1, endIndex);

        int[] tempArray = new int[endIndex - startIndex + 1];
        int tempIndex = 0;
        int i = startIndex, j = currentIndex + 1;

        while(i <= currentIndex && j <= endIndex){
            if( array[i] < array[j] ){
                tempArray[tempIndex++] = array[i++];
            }else{
                tempArray[tempIndex++] = array[j++];
            }
        }
        while(i <= currentIndex){
            tempArray[tempIndex++] = array[i++];
        }
        while(j <= endIndex ){
            tempArray[tempIndex++] = array[j++];
        }

        for(tempIndex = 0; tempIndex < tempArray.length; tempIndex++){
            array[startIndex] = tempArray[tempIndex];
            startIndex++;
        }
    }
}
