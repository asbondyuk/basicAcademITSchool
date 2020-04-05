package L4;

import java.util.Scanner;

/**
 * L4: Цифры числа
 * <p>
 * Прочитать с консоли целое число
 * • Найдите сумму его цифр
 * • Найдите сумму только тех цифр числа, которые являются
 * нечетными числами
 * • Найдите максимальную цифру числа
 */
public class NumberDigits {
    public static void main(String[] args) {
        System.out.println("Определениее суммы цифр, суммы нечетных цифр, максимальной цифры числа");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для разбора:");
        int number = scanner.nextInt();

        int numberDigitsSum = 0;
        int numberMaxDigit = 0;
        int numberOddDigitsSum = 0;

        while (number > 0) {
            int digit = number % 10;
            numberDigitsSum += digit;

            if (digit % 2 == 1) {
                numberOddDigitsSum += digit;
            }

            if (numberMaxDigit < digit) {
                numberMaxDigit = digit;
            }

            number /= 10;
        }

        System.out.printf("Сумма цифр %d, сумма нечетных цифр %d, максимальное число %d",
                numberDigitsSum, numberOddDigitsSum, numberMaxDigit);
    }
}
