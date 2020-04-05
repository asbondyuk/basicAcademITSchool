package L5;

import java.util.Scanner;

/**
 * L5: Вклад
 * <p>
 * Напишите программу, которая рассчитывает сумму
 * банковского вклада с заданной ставкой % годовых
 * на заданное число месяцев
 * • Вклад с капитализацией – считаем, что после
 * истечения каждого месяца к сумме вклада
 * прибавляется процент от суммы вклада на начало
 * месяца
 * • Также распечатать прибыль
 */
public class Deposit {
    public static void main(String[] args) {
        System.out.println("Программа: расчет % по вкладу");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        double initialDepositAmount = scanner.nextDouble();

        System.out.println("Введите процентную ставку (% годовых)");
        double interestRate = scanner.nextDouble();

        System.out.println("Введите число месяцев");
        int monthsCount = scanner.nextInt();

        final int fullPercentage = 100;
        final int monthsInYearCount = 12;

        double finalDepositAmount = initialDepositAmount;
        double monthlyInterestRate = interestRate / monthsInYearCount / fullPercentage;
        double monthlyIncrease = 1 + monthlyInterestRate;

        for (int i = 0; i < monthsCount; i++) {
            finalDepositAmount *= monthlyIncrease;
        }

        double profit = finalDepositAmount - initialDepositAmount;
        System.out.printf("Значение вклада по завершению срока: %.2f. Прибыль: %.2f", finalDepositAmount, profit);
    }
}
