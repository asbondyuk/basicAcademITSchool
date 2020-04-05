package L3;

import java.util.Scanner;

/**
 * Лекция 3: знак числа
 * <p>
 * Прочитайте с консоли целое число
 * Если оно положительное, то напечатайте в консоль строку –
 * «Данное число - положительное»
 * Если оно 0, то распечатайте, что оно 0
 * Если отрицательное, то, распечатайте, что число
 * отрицательное
 * Используйте цепочку if’ов
 */
public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        } else if (number == 0) {
            System.out.println("Данное число - 0");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
