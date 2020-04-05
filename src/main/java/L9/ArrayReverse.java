package L9;

import java.util.Arrays;

/**
 * L9: Разворот массива
 * <p>
 * Переставить элементы массива в обратном порядке
 */
public class ArrayReverse {
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        reverseArray(array1);
        reverseArray(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}