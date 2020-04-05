package L3;

import java.util.Scanner;

/**
 * Лекция 3: Max/min
 * <p>
 * Прочитать из консоли два целых числа
 * Вывести наименьшее и наибольшее из них
 * Сделать данную задачу при помощи if-else(1) и при помощи
 * тернарного оператора(2)
 */
public class IfElseMaxMin {
    public static void main(String[] args) {
        System.out.println("Сравнение 2-х чисел");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        // 1
        System.out.println("If-else говорит, что");
        int ifElseMax;
        int ifElseMin;
        if (number1 > number2) {
            ifElseMax = number1;
            ifElseMin = number2;
        } else {
            ifElseMax = number2;
            ifElseMin = number1;
        }

        System.out.println("Max: " + ifElseMax);
        System.out.println("Min: " + ifElseMin);

        // 2
        System.out.println("Тернарный оператор говорит, что");
        int ternaryMax = (number1 > number2) ? number1 : number2;
        int ternaryMin = (number1 > number2) ? number2 : number1;
        System.out.println("Max: " + ternaryMax);
        System.out.println("Min: " + ternaryMin);
    }
}
