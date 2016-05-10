import sortings.*;

import java.util.Arrays;

/**
 * Created by sergey on 06/05/16.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};

        System.out.println("Array before sorting - " + Arrays.toString(array));

        BubbleSort.sort(array);
        System.out.println("Array after Bubble sort - " + Arrays.toString(array));

        array = new int[]{-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};
        SelectSort.sort(array);
        System.out.println("Array after Select sort - " + Arrays.toString(array));

        array = new int[]{-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};
        InsertionSort.sort(array);
        System.out.println("Array after Insertion sort - " + Arrays.toString(array));

        array = new int[]{-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};
        ShellSort.sort(array);
        System.out.println("Array after Shell sort - " + Arrays.toString(array));

        array = new int[]{-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};
        QuickSort.sort(array);
        System.out.println("Array after Quick sort - " + Arrays.toString(array));

        array = new int[]{-1, 5, 20, 14, -11, 12, 21, 0, -5, -10, 7, 3, 5, 20, -4, 0};
        MergeSort.sort(array);
        System.out.println("Array after Merge sort - " + Arrays.toString(array));
    }
}
