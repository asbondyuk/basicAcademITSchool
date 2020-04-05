package L3;

import java.util.Scanner;

/**
 * Лекция 3: Пароль
 * <p>
 * В программе объявить строковую переменную, хранящую
 * пароль
 * С консоли прочитать строку, сравнить её с этим паролем.
 * Если строка совпала (проверять при помощи equals), то
 * выдать сообщение, что пароль верный
 * Если строка не совпала с паролем, и её длина
 * (использовать length) больше длины пароля, то сказать что
 * пароль неверный и строка слишком длинная
 * Если строка не совпала с паролем, и её длина меньше, то
 * сказать, что пароль неверный строка слишком короткая
 * Иначе сказать, что пароль неверный
 */
public class Password {
    public static void main(String[] args) {
        String password = "12345";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String passwordToVerify = scanner.nextLine();

        if (password.equals(passwordToVerify)) {
            System.out.println("Пароль верный");
        } else {
            if (passwordToVerify.length() > password.length()) {
                System.out.println("Пароль неверный и строка слишком длинная");
            } else if (passwordToVerify.length() < password.length()) {
                System.out.println("Пароль неверный и строка слишком короткая");
            } else {
                System.out.println("Пароль неверный");
            }
        }
    }
}
