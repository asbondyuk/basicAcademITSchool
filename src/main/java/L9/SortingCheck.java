package L9;

import java.util.Arrays;

/**
 * L9: Проверка сортировки
 * <p>
 * Написать функцию, которая проверяет, что массив
 * отсортирован по возрастанию
 * • И написать функцию, которая проверяет, что массив
 * отсортирован по убыванию
 */

public class SortingCheck {
    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arrayAsc = {1, 2, 3, 4, 5, 6};
        int[] arrayDesc = {6, 5, 4, 3, 2, 1};
        int[] array = {1, 2, 4, 5, 1, 4};

        System.out.println(Arrays.toString(arrayAsc) + " отсортирован по возрастанию: " + isSortedAscending(arrayAsc));
        System.out.println(Arrays.toString(arrayAsc) + " отсортирован по убыванию: " + isSortedDescending(arrayAsc));

        System.out.println(Arrays.toString(arrayDesc) + " отсортирован по возрастанию: " + isSortedAscending(arrayDesc));
        System.out.println(Arrays.toString(arrayDesc) + " отсортирован по убыванию: " + isSortedDescending(arrayDesc));

        System.out.println(Arrays.toString(array) + " отсортирован по возрастанию: " + isSortedAscending(array));
        System.out.println(Arrays.toString(array) + " отсортирован по убыванию: " + isSortedDescending(array));
    }
}
