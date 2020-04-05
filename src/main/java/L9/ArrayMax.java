package L9;

/**
 * L9: Поиск максимума
 * <p>
 * Написать функцию, которая ищет максимальное число в
 * массиве вещественных чисел
 */
public class ArrayMax {
    public static double getArrayMax(double[] array) {
        double max = array[0];

        for (double value : array) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        double[] array = {1.2, 5, 6.1, 1.1, 0.99};

        System.out.println("Максимальное число массива: " + getArrayMax(array));
    }
}
