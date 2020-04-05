import java.util.Scanner;

/**
 * L4: Сумма ряда
 * <p>
 * • Написать программу, которая находит результат такого
 * выражения:
 * • 1 – 4 + 9 – 16 + 25 – 36 ...
 * • Количество чисел в этом выражении должно быть
 * параметром программы
 */
public class RowSum {
    public static void main(String[] args) {
        System.out.println("Вычисление суммы ряда (-1)^n * n^2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += (int) Math.pow(-1, i + 1) * Math.pow(i, 2);
            ++i;
        }

        System.out.printf("Сумма %d чисел составляет %d", n, sum);
    }
}
