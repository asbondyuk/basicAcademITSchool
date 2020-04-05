package L11;

import java.util.Arrays;

/**
 * L11: Сортировка пузырьком
 * <p>
 * Реализовать сортировку пузырьком
 */
public class BubbleSorting {
    public static int[] sortBubble(int[] array) {
        boolean wasChanges;
        int count = 0;

        do {
            wasChanges = false;

            for (int i = 0; i < array.length - 1 - count; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                    wasChanges = true;
                }
            }

            count++;
        } while (wasChanges);

        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 7, 1, 10, 2, 5};

        System.out.println(Arrays.toString(sortBubble(array)));
    }
}
