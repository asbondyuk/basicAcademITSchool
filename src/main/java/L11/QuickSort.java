package L11;

import java.util.Arrays;

/**
 * L11: Быстрая сортировка
 * <p>
 * Реализовать быструю сортировку
 */
public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        int betweenBordersDifference = right - left;

        if (betweenBordersDifference <= 0) {
            return;
        }

        if (betweenBordersDifference == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        // основной алгоритм
        int pivot = array[left + betweenBordersDifference / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }

            while (array[j] > pivot) {
                --j;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                ++i;
                --j;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }

        if (right > i) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 10, 2, 5};
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left, right);

        System.out.println(Arrays.toString(array));
    }
}
