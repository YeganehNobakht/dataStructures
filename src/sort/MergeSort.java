package sort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] array) {

        if (array.length < 2)
            return;

        int middleItem = array.length / 2;

        int[] leftSubArray = new int[middleItem];
        int[] rightSubArray = new int[array.length - middleItem];

        for (int i = 0; i < middleItem; i++) {
            leftSubArray[i] = array[i];
        }
        for (int i = middleItem; i < array.length; i++) {
            rightSubArray[i - middleItem] = array[i];
        }

        sort(leftSubArray);
        sort(rightSubArray);

        merge(leftSubArray, rightSubArray, array);
    }

    private static void merge(int[] leftSubArray, int[] rightSubArray, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < leftSubArray.length && j < rightSubArray.length) {
            if (leftSubArray[i] < rightSubArray[j])
                result[k++] = leftSubArray[i++];
            else
                result[k++] = rightSubArray[j++];
        }

        if (i < leftSubArray.length)
            result[k++] = leftSubArray[i++];

        if (j < rightSubArray.length)
            result[k++] = rightSubArray[j++];
    }


    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }


}
