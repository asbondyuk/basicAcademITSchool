package L8;

import java.util.Scanner;

/**
 * L8: КЗ Максимальная подстрока
 * <p>
 * Написать функцию, которая ищет в строке подстроку
 * максимальной длины, состоящую из одного и того же
 * символа, и выдает эту максимальную длину
 * • Например, есть строка "аааббдеггггв", должно выдаться
 * число 4, потому что есть 4 подряд символа «г», и это
 * максимальная подстрока, где подряд идет один и тот же
 * символ
 * • Функция должна работать без учета регистра
 */

public class MaxSubstringLength {
    public static int getMaxSubstringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }

        String lowerCaseString = string.toLowerCase();

        char currentChar = lowerCaseString.charAt(0);
        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < lowerCaseString.length(); ++i) {
            if (currentChar != lowerCaseString.charAt(i)) {
                currentChar = lowerCaseString.charAt(i);
                currentSubstringLength = 1;
            } else {
                ++currentSubstringLength;
            }

            if (currentSubstringLength > maxSubstringLength) {
                maxSubstringLength = currentSubstringLength;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        System.out.println("Поиск максимальной подстроки");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для анализа");
        String string = scanner.nextLine();

        System.out.println("Максимальная длина подстроки: " + getMaxSubstringLength(string));
    }
}
