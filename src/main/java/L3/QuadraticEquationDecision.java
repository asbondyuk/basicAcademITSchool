package L3;

import java.util.Scanner;

/**
 * L3: квадратное уравнение
 * <p>
 * Прочитать с консоли коэффициенты a, b и c квадратного
 * уравнения 2 + + = 0 и найти решение этого
 * уравнения
 * Не забыть рассмотреть все 3 случая – когда есть 2 корня, 1
 * корень и нет решений
 * Программа должна работать даже если уравнение не
 * квадратное (a равен 0), например, решать линейное
 * уравнение и т.д.
 */
public class QuadraticEquationDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения a * x^2 + b * x + c = 0");

        System.out.println("Введите коэффициент a");
        double a = scanner.nextDouble();

        System.out.println("Введите коэффициент b");
        double b = scanner.nextDouble();

        System.out.println("Введите коэффициент c");
        double c = scanner.nextDouble();

        // Обработка нулевых коэффициентов x
        final double epsilon = 1.0e-10;
        if ((Math.abs(a) < epsilon) && (Math.abs(b) < epsilon)) {
            if (Math.abs(c) < epsilon) {
                System.out.println("Уравнение не зависит от x, x -любые");
                return;
            }

            System.out.println("Корней нет, смысла в выражении " + c + " = 0 нет");
            return;
        }

        if (Math.abs(a) < epsilon) {
            double x = -c / b;
            System.out.println("Уравнение линейное, корень один: " + x);
            return;
        }

        // Решение квадратного уравнения
        double discriminant = b * b - 4 * a * c;

        if (discriminant <= -epsilon) {
            System.out.println("Дискриминант отрицателен, корней нет");
        } else if (Math.abs(discriminant) < epsilon) {
            double x = -b / (2 * a);
            System.out.println("Корень один: " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корней два:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}