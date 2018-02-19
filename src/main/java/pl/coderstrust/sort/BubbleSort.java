package pl.coderstrust.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sortBubble(int [] array) {
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

    public static void main(String[] args) {
        int [] array = {13, 25, 11, 4, 33, 8, 2};
        sortBubble(array);

        System.out.print(Arrays.toString(array));
    }


}
