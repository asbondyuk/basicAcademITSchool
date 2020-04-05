package L5;

import java.util.Scanner;

/**
 * L5: Break
 * <p>
 * В программе должна быть некоторая загаданная
 * фиксированная строка
 * • Далее программа предлагает пользователю ввести строку,
 * пользователь вводит
 * • Если введена та загаданная строка, то программа должна
 * завершаться
 * • Иначе пользователю дается следующая попытка для ввода
 * и т.д., пока не введет правильно. При этом каждый раз
 * пользователю должно выдаваться приглашение для ввода
 * • В этой задаче используйте бесконечный цикл и break
 */
public class Break {
    public static void main(String[] args) {
        System.out.println("Угадайте строку");

        String hiddenString = "qwerty";

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите строку:");
            String enteredUserString = scanner.nextLine();

            if (hiddenString.equals(enteredUserString)) {
                break;
            }
        }

        System.out.println("Строка введена верно");
    }
}
