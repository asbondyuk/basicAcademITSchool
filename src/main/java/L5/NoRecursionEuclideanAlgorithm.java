package L5;

import java.util.Scanner;

/**
 * L5: Алгоритм Евклида
 * <p>
 * Задача про НОД
 * • Необходимо реализовать рекурсивную версию в
 * виде функции
 * b, если a % b = 0
 * НОД a, b = ቊ
 * НОД b, a % b иначе,
 * • где x % y – остаток от деления x на y
 */
public class NoRecursionEuclideanAlgorithm {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        int divisorRemainder = number1 % number2;

        while (divisorRemainder != 0) {
            int tmp = number2;
            number2 = divisorRemainder;
            number1 = tmp;

            divisorRemainder = number1 % number2;
        }

        return number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Нахождение наибольшего общего делителя алгоритмом Евклида (без рекурсии)");

        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("НОД искать нельзя - оба числа 0");
            return;
        }

        int greatestCommonDivisor = getGreatestCommonDivisor(number1, number2);
        System.out.printf("Наибольший общий делитель чисел %d и %d равен %d", number1, number2, greatestCommonDivisor);
    }
}
