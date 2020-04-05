package L5;

import java.util.Scanner;

/**
 * L5: Простые числа
 * <p>
 * Прочитать с консоли целое число
 * • Найти и распечатать все простые числа, не превышающие
 * введенное число
 */
public class PrimeNumbers {
    public static boolean isPrime(int number) {
        int divisorSearchLimit = (int) Math.sqrt(number);

        for (int i = 2; i <= divisorSearchLimit; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Определение простых чисел");

        System.out.println("Введите число:");
        int maxNumber = scanner.nextInt();

        for (int i = 2; i <= maxNumber; ++i) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
}
