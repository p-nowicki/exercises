package pl.coderstrust.sortings;

import java.util.Arrays;

public class CollectionsSort implements SortingMethod {

    public static void sortCollections(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int array[] = {13, 25, 11, 4, 33, 8, 2};

        sortCollections(array);

    }

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }
}
