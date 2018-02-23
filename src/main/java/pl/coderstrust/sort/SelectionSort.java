package pl.coderstrust.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void SelectSort(int [] array) {
        for (int i = 0; i < array.length; ++i) {
            int minimumIndex = i;
            for(int j = i; j < array.length; ++j)
                if (array[j] < array[minimumIndex])
                    minimumIndex = j;

            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        int array[] = {13, 25, 11, 4, 33, 8, 2};
        SelectSort(array);

        System.out.print(Arrays.toString(array));

    }


}
