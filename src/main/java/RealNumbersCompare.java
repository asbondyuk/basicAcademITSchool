import java.util.Scanner;

/**
 * L4: Сравнение двух вещественных чисел
 * <p>
 * Прочитать два вещественных числа с консоли
 * Проверить, что они равны с учетом погрешности
 * Выдать соответствующее сообщение
 */
public class RealNumbersCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Проверка на равенство вещественных чисел");

        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs(firstNumber - secondNumber) <= epsilon) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа неравны");
        }
    }
}
