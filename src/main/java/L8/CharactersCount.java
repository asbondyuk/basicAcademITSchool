package L8;

import java.util.Scanner;

/**
 * L8: ДЗ подсчет символов
 * <p>
 * Прочитать с консоли строку
 * • Вывести число букв в этой строке
 * • Вывести число цифр в этой строке
 * • Вывести число пробелов в этой строке
 * • Вывести число остальных символов в строке
 */
public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Подсчет симоволов");

        System.out.println("Введите строку для подсчета символов:");
        String string = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char sign = string.charAt(i);

            if (Character.isLetter(sign)) {
                ++lettersCount;
            } else if (Character.isDigit(sign)) {
                ++digitsCount;
            } else if (Character.isWhitespace(sign)) {
                ++spacesCount;
            } else {
                ++otherSymbolsCount;
            }
        }

        System.out.printf("Букв: %d, Цифр: %d, Пробелов: %d, Остальных: %d",
                lettersCount, digitsCount, spacesCount, otherSymbolsCount);
    }
}
