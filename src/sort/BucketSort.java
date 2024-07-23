package sort;

import java.util.*;

public class BucketSort {

    public static void sort(int[] array, int bucketsNumber) {
        int i = 0;
        for (List<Integer> bucket : createBuckets(array, bucketsNumber)) {
            Collections.sort(bucket);
            for (Integer item : bucket)
                array[i++] = item;
        }
    }

    private static List<List<Integer>> createBuckets(int[] array, int bucketsNumbers) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketsNumbers; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int item : array) {
            buckets.get(item / bucketsNumbers).add(item);
        }
        return buckets;
    }


    public static void main(String[] args) {
        int[] array = {8, 2, 2, 5, 5, 4, 1, 3};
        sort(array, 8);
        System.out.println(Arrays.toString(array));
    }
}
