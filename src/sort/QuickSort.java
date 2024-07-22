package sort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] array){
        sort(array, 0, array.length-1);
    }
    private static void sort(int[] array, int start, int end){

        if (start >= end){
            return;
        }

        int boundary = partitioning(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary+1, end);

    }

    private static int partitioning(int[] array, int start, int end) {
        int pivot = array[end];
        int b = start -1;

        for (int i = start ; i<array.length ; i++){
            if (array[i] <= pivot){
                b++;
                swap(i,b,array);

            }
        }
        return b; //stand for boundary
    }

    private static void swap (int firstIndex, int secondIndex, int[] originalArray){
        int temp = originalArray[firstIndex];
        originalArray[firstIndex] = originalArray [secondIndex];
        originalArray[secondIndex] = temp;
    }




    public static void main(String[] args) {
        int[] array = {8, 2, 4, 1, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
