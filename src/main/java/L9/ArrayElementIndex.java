package L9;

/**
 * L9: Поиск элемента
 * <p>
 * Написать функцию, которая ищет указанное число в
 * массиве, и если находит его, то выдает его индекс. А если
 * не находит, то выдает -1
 */
public class ArrayElementIndex {
    public static int getArrayElementIndex(int[] array, int number) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 1, 4};
        int searchNumber = 4;

        System.out.printf("Индекс первого вхождения числа %d в массив: %d", searchNumber, getArrayElementIndex(array, searchNumber));
    }
}