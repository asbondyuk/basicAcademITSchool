package L3;

import java.util.Scanner;

/**
 * Лекция 3: високосный год
 * <p>
 * Прочитать с консоли год и вывести в консоль, является он
 * високосным или нет
 * Старайтесь использовать логические связки, если это
 * возможно
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год для определения, является ли он високосным:");
        int year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год невисокосный");
        }
    }
}
