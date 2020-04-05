package L2;

import java.util.Scanner;

/**
 * Лекция 2
 * <p>
 * Написать программу, которая просит ввести ваше имя, а
 * затем выводит в консоль приветствие. Для чтения
 * использовать nextLine() Scanner’а
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}
