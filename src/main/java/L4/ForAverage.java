package L4;

import java.util.Scanner;

/**
 * L4: Среднее арифметическое
 * <p>
 * Написать программу, вычисляющую среднее
 * арифметическое чисел из некоторого диапазона чисел
 * (например, от 3 до 17)
 * • Концы диапазона задать переменными, начальное число
 * берите > 1, чтобы было посложнее
 * • Среднее арифметическое чисел – нужно сумму всех чисел
 * поделить на количество этих чисел
 * • Ниже в этом же классе - найти среднее арифметическое
 * только четных чисел из этого диапазона чисел
 */
public class ForAverage {
    public static void main(String[] args) {
        System.out.println("Вычисление среднего арфиметического диапазона чисел с использованием for");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (нижнюю границу):");
        int startNumber = scanner.nextInt();

        System.out.println("Введите последнее число (верхнюю границу):");
        int endNumber = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int evenSum = 0;
        int evenCount = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
            count++;

            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            }
        }

        System.out.printf("Среднее арфиметическое чисел от %d до %d составляет %f %n", startNumber, endNumber,
                (double) sum / count);
        System.out.printf("Среднее арфиметическое четных чисел от %d до %d составляет %f", startNumber, endNumber,
                (double) evenSum / evenCount);
    }
}
