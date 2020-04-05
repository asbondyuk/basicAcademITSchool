package L3;

import java.util.Scanner;

/**
 * Лекция 3: кратность числа
 * <p>
 * Прочитайте с консоли целое число
 * Напечатайте, что число четное, если оно четное. И что
 * нечетное, если оно нечетное
 * И что кратно 5, если кратно 5 И что не кратно 5, если оно
 * не кратно 5
 */
public class NumberMultiplicity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        if (number % 5 == 0) {
            System.out.println("Кратно 5");
        } else {
            System.out.println("Не кратно 5");
        }
    }
}
