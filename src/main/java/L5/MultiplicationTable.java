package L5;

import java.util.Scanner;

/**
 * L5: Таблица умножения
 * <p>
 * Вывести в консоль таблицу умножения чисел от 1 до 10 при
 * помощи циклов for
 * • Но программа должна работать верно и если попросят таблицу
 * от 1 до другого числа
 * • Примерно так, только без границ клеток, консоль этого не
 * позволяет
 * • Добейтесь чтобы числа
 * были выровнены по
 * столбцам (добейте
 * числа нужным количеством
 * пробелов)
 * • Добавьте «шапку» таблицы,
 * отделите ее символами,
 * например, | и --
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Таблица умножения");

        System.out.println("Ввведите размерность:");
        int dimension = scanner.nextInt();

        // определяем максимальный порядок числа (для количества пробелов)
        int maxDisplayedNumber = dimension * dimension;
        int numberDigitsCount = (int) Math.log10(maxDisplayedNumber) + 1;
        int columnCharactersCount = 1 + numberDigitsCount;
        String tableColumnFormat = "%" + columnCharactersCount + "d";

        // вывод заголовка (первой строки)
        for (int i = 0; i < columnCharactersCount; ++i) {
            System.out.print(" ");
        }

        System.out.print("|");

        for (int i = 1; i <= dimension; ++i) {
            System.out.printf(tableColumnFormat, i);
        }

        System.out.println();

        // граница первой строки
        for (int i = 0; i < columnCharactersCount; ++i) {
            System.out.print("-");
        }

        System.out.print("|");

        for (int i = 0; i < dimension; ++i) {
            for (int j = 0; j < columnCharactersCount; ++j) {
                System.out.print("-");
            }
        }

        System.out.println();

        for (int i = 1; i <= dimension; ++i) {
            // вывод первого столбца
            System.out.printf(tableColumnFormat, i);
            System.out.print("|");

            for (int j = 1; j <= dimension; ++j) {
                System.out.printf(tableColumnFormat, i * j);
            }

            System.out.println();
        }
    }
}
