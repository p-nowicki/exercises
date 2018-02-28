package pl.coderstrust.sortings;

import java.util.Arrays;

public class FiveSortingMethods {

    public static void sortBubble(int[] array) {
        boolean swap;
        for (int i = 0; i < array.length - 1; ++i) {
            swap = false;
            for (int j = 0; j < (array.length - i - 1); ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int minimumIndex = i;
            for (int j = i; j < array.length; ++j)
                if (array[j] < array[minimumIndex])
                    minimumIndex = j;

            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void sortCollections(int[] array) {
        Arrays.sort(array);

    }

    public static void main(String[] args) {
        int array[] = {13, 25, 11, 4, 33, 8, 2};

        selectSort(array);

        System.out.println(Arrays.toString(array));

        sortBubble(array);

        System.out.println(Arrays.toString(array));

        sortCollections(array);

        System.out.println(Arrays.toString(array));


    }
}
