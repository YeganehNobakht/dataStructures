package search;

public class SearchAlgorithms {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == target)
                return middle;
            if (target < array[middle])
                return middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }


    public static int binarySearchRec(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        int middle = (left + right) / 2;
        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchRec(array, target, left, middle - 1);
        else
            return binarySearchRec(array, target, middle + 1, right);
    }


    public static int ternarySearch(int[] array, int target) {
        return ternarySearch(array, target, 0, array.length - 1);
    }

    public static int ternarySearch(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;
        if (array[mid2] == target)
            return mid2;
        if (target < array[mid1])
            return ternarySearch(array, target, left, mid1 - 1);

        if (target > array[mid2])
            return ternarySearch(array, target, mid2, right);

        return ternarySearch(array, target, mid1 + 1, mid2 - 1);
    }


    public static int jumpSearch(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0, next = blockSize;

        while (array[next - 1] < target && start < array.length) {
            start = next;
            next = start + blockSize;
            if (next > array.length)
                next = array.length;
        }
        for (int i = 0; i < next; i++)
            if (array[i] == target)
                return i;
        return -1;
    }

    public static int exponentialSearch(int[] array, int target) {
        int bound = 1;
        while (array[bound] < target && bound < array.length) {

            bound *= 2;
        }
        int left = bound/2;
        int right = Math.min(bound, array.length - 1);
        return binarySearchRec(array, target, left, right);
    }
}
