package sort;

import java.util.Arrays;

public class BubbleSort {

//    isSorted variable is added because of optimization when array is already sorted.
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            for (int j = 1; j < array.length - i; j++) {
                isSorted = true;
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
