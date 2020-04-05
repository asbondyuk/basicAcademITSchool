package L11;

import java.util.Arrays;

/**
 * L11: КЗ Сортировка выбором
 * <p>
 * Реализовать сортировку выбором
 */
public class SelectionSort {
    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            double tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        double[] array = {3, 4, 7, 1, 10, 2, 5};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
