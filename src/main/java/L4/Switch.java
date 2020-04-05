package L4;

import java.util.Scanner;

/**
 * L4 : Switch
 * <p>
 * Задача на дом «Switch»
 * • Прочитать с консоли три числа – два операнда и
 * код команды
 * <p>
 * Код команды должен быть от 1 до 4
 * Если он равен 1, то выполнить сложение первых двух чисел.
 * Если 2, то вычитание,
 * если 3, то * умножение,
 * если 4, то деление.
 * <p>
 * • Если ввели число не от 1 до 4, то вывести, что
 * неизвестная операция
 * • Использовать switch
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор двух чисел");

        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Введите команду (1+ 2- 3* 4/):");
        int instruction = scanner.nextInt();

        switch (instruction) {
            case 1:
                System.out.printf("%f + %f  = %f", firstNumber, secondNumber, firstNumber + secondNumber);
                break;
            case 2:
                System.out.printf("%f - %f  = %f", firstNumber, secondNumber, firstNumber - secondNumber);
                break;
            case 3:
                System.out.printf("%f * %f  = %f", firstNumber, secondNumber, firstNumber * secondNumber);
                break;
            case 4:
                System.out.printf("%f / %f  = %f", firstNumber, secondNumber, firstNumber / secondNumber);
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
