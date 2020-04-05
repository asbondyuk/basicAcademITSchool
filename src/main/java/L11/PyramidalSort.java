package L11;

import java.util.Arrays;

/**
 * L11: Пирамидальная сортировка
 */
public class PyramidalSort {
    public static void pyramidalSort(int[] array) {
        // просеиваем
        for (int i = array.length / 2 - 1; i >= 0; --i) {
            screen(array, array.length, i);
        }

        // приводим к упорядоченному виду
        for (int i = array.length - 1; i >= 1; --i) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            screen(array, i, 0);
        }
    }

    public static void screen(int[] array, int heapSize, int parentIndex) {
        boolean isSwap;
        int currentIndex = parentIndex;

        do {
            isSwap = false;
            int child1 = 2 * currentIndex + 1;
            int child2 = 2 * currentIndex + 2;

            if (child1 >= heapSize) {
                return;
            }

            // находим максимального ребенка
            int maxChildIndex = child1;
            if (child2 < heapSize && array[child2] > array[child1]) {
                maxChildIndex = child2;
            }

            if (array[maxChildIndex] > array[currentIndex]) {
                int swap = array[currentIndex];
                array[currentIndex] = array[maxChildIndex];
                array[maxChildIndex] = swap;

                currentIndex = maxChildIndex;
                isSwap = true;
            }
        } while (isSwap);
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 3, 6, 8, 7, 1, 12};

        pyramidalSort(array);

        System.out.println(Arrays.toString(array));
    }
}
