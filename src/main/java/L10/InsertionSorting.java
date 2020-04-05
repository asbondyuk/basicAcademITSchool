package L10;

import java.util.Arrays;

/**
 * L10: Сортировка вставками
 * <p>
 * Реализовать сортировку вставками
 */
public class InsertionSorting {
    public static void sortByInsertion(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j = i - 1;

            for (; j >= 0 && temp < array[j]; --j) {
                array[j + 1] = array[j];
            }

            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 10, 2, 5, 6};

        sortByInsertion(array);

        System.out.println(Arrays.toString(array));
    }
}
