package pl.coderstrust.sortings;

public class SelectionSort implements SortingMethod {

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

    public static void main(String[] args) {
        int array[] = {13, 25, 11, 4, 33, 8, 2};

        selectSort(array);

    }

    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }
}
