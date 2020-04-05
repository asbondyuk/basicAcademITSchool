package L3;

import java.util.Scanner;

/**
 * Лекция 3: Возраст
 * <p>
 * Программа просит ввести пользователя свой возраст от 1
 * до 112 включительно, после чего выводит сообщение
 * «Вам x лет»
 * При этом учесть, что для разных чисел разные склонения
 * Например, «3 года», «99 лет» и т.д.
 * Если введут слишком малое или слишком большое число,
 * то выведите, что «Вы слишком малы» или стары
 * Старайтесь использовать логические связки, если это
 * возможно
 */
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы");
            return;
        }

        if (age > 112) {
            System.out.println("Вы слишком стары");
            return;
        }

        int lastDigit = age % 10;
        int tens = (age / 10) % 10;

        if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4) && tens != 1) {
            System.out.println("Вам " + age + " года");
        } else if (lastDigit == 1 && tens != 1) {
            System.out.println("Вам " + age + " год");
        } else {
            System.out.println("Вам " + age + " лет");
        }
    }
}
