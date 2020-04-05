package L3;

import java.util.Scanner;

/**
 * Лекция 3: Следующая дата
 * <p>
 * Программа запрашивает сегодняшнюю дату, и выдает дату
 * следующего дня
 * Например, входные данные: 31 12 2015, на выходе:
 * 01.01.2016
 * День, месяц и год можно запрашивать у пользователя с
 * консоли по очереди
 * Еще сделать проверку даты на корректность
 */
public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Определение следующего дня");

        // Получение даты
        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        // Валидация введеных значений
        int monthsInYearCount = 12;
        if (month <= 0 || monthsInYearCount < month) {
            System.out.println("Дата некорректна: некорректен месяц");
            return;
        }

        int[] monthDaysCounts = {31, 29, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31};
        if (day <= 0 || monthDaysCounts[month - 1] < day) {
            System.out.println("Дата некорректна: некоррентен день");
            return;
        }

        // Валидация: проверка февраля невисокосных годов
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        if (!isLeapYear) {
            if (month == 2 && day == 29) {
                System.out.println("Дата некорректна: год невисокосный, в феврале 28 дней");
                return;
            }
        }

        // Расчет даты
        // Смена года
        if ((month == monthsInYearCount) && (day == monthDaysCounts[month - 1])) {
            int newYear = year + 1;
            System.out.printf("Следующий день: 01.01.%02d", newYear);
            return;
        }

        // Смена месяца
        // Обработка февраля високосных годов
        if (day == 28 && month == 2 && isLeapYear) {
            System.out.printf("Следующий день: 29.02.%02d", year);
            return;
        }

        // Обработка февраля невисокосных годов
        if (day == 28 && month == 2) {
            System.out.printf("Следующий день: 01.03.%02d", year);
            return;
        }

        if (day == monthDaysCounts[month - 1]) {
            int newMonth = month + 1;
            System.out.printf("Следующий день: 01.%02d.%02d", newMonth, year);
            return;
        }

        // Обычный расчет
        int newDay = day + 1;
        System.out.printf("Следующий день: %02d.%02d.%02d", newDay, month, year);
    }
}
