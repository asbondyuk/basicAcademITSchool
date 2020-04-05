package L9;

/**
 * L9: Средне арифметическое массива
 * <p>
 * Найти среднее арифметическое элементов массива,
 * которые являются четными числами
 */
public class ArrayEvenAverage {
    public static double getArrayEvenAverage(int[] array) {
        int sum = 0;
        int count = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
                ++count;
            }
        }

        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 1, 4};

        System.out.printf("Средне арифметическое четных чисел массива %.2f", getArrayEvenAverage(array));
    }
}