package L4;

import java.util.Scanner;

/**
 * L4: Do-while
 * <p>
 * Сделать задачу про среднее арифметическое с
 * циклом do-while
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
public class DoWhileAverage {
    public static void main(String[] args) {
        System.out.println("Вычисление среднего арфиметического диапазона чисел с использованием Do-while");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (нижнюю границу):");
        int startNumber = scanner.nextInt();

        System.out.println("Введите последнее число (верхнюю границу):");
        int endNumber = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int evenSum = 0;
        int evenCount = 0;
        int i = startNumber;

        do {
            sum += i;
            count++;

            if (i % 2 == 0) {
                evenSum += i;
                ++evenCount;
            }

            ++i;
        } while (i <= endNumber);

        System.out.printf("Среднее арфиметическое чисел от %d до %d составляет %f %n", startNumber, endNumber,
                (double) sum / count);
        System.out.printf("Среднее арфиметическое четных чисел от %d до %d составляет %f", startNumber, endNumber,
                (double) evenSum / evenCount);
    }
}
