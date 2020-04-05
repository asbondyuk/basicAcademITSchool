package L6;

import java.util.Scanner;

/**
 * L6: Print and read
 * <p>
 * Написать функцию, которая объединяет в себе две
 * операции: вывод пользователю приглашения для ввода в
 * консоль и чтение int’а с консоли
 * • Функция должна принимать строку и возвращать
 * прочитанное число
 * • Из функции main несколько раз вызвать данную функцию с
 * разными значениями аргументов
 * • Пример, как функция будет вызываться:
 * int a = printAndRead(“Введите число:”)
 */
public class PrintAndRead {
    public static int printAndRead(String text) {
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.println(a);

        int b = printAndRead("Еще раз");
        System.out.println(b);

        int c = printAndRead("И последний:");
        System.out.println(c + " - внезапно, да?");
    }
}
