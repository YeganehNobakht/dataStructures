package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array){
        for (int i = 1 ; i < array.length ; i++){
            int current = array[i];
            for (int j = i-1 ; j < i ; j --) {
                if (current < array[j]){
                    array[j+1] = array[j];
                    array[j] = current;
//                    current = array [j];
                }
                if (j == 0 )
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8,2,4,1,3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
