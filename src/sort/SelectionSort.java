package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length ; i++){
            for (int j = i+1 ; j < array.length ; j++){
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8,2,4,1,3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
