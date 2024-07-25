package search;

public class SearchAlgorithms {
    public static int linearSearch(int[] array, int target){
        for (int i = 0; i<array.length; i++){
            if (array[i] == target)
                return i;
        }
        return -1;
    }


}
