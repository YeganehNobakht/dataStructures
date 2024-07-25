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

}
