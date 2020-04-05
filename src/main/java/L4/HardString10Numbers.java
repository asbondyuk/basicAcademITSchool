package L4;

import java.util.Scanner;

/**
 * L4: ДЗ 10 чисел в строке
 * <p>
 * Сложная версия задачи:
 * • Выводить числа ровно, чтобы они были друг под
 * другом. Использовать System.out.printf
 * • Возможность задать начальное и конечное число, и по
 * сколько чисел в строке выводить
 */
public class HardString10Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Построчный вывод элементов");

        System.out.println("Введите начальное число:");
        int begin = scanner.nextInt();

        System.out.println("Введите конечное число:");
        int end = scanner.nextInt();

        System.out.println("Введите количество элементов в строке:");
        int numbersInRowCount = scanner.nextInt();

        // определяем максимальный порядок числа (для количества пробелов)
        int numberDigitsCount = (int) Math.log10(end) + 1;
        int maxNumberLength = 1 + numberDigitsCount;

        // выводим таблицу значений
        int i = begin;
        int count = 0;
        String lineFormat = "%" + maxNumberLength + "d";

        while (i <= end) {
            System.out.printf(lineFormat, i);
            ++count;

            if (count == numbersInRowCount) {
                System.out.println();
                count = 0;
            }

            ++i;
        }
    }
}
