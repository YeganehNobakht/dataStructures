package sort;

import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] array, int max) {
        int[] countArray = new int[max + 1];
        for (int item : array)
            countArray[item]++;

        int k = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++)
                array[k++] = i;
        }
    }


    public static void main(String[] args) {
        int[] array = {8, 2, 2, 5, 5, 4, 1, 3};
        sort(array, 8);
        System.out.println(Arrays.toString(array));
    }
}
