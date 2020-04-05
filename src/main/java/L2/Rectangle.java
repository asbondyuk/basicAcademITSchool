package L2;

import java.util.Scanner;

/**
 * Лекция 2
 * <p>
 * Программа, читающая с консоли длину и ширину
 * прямоугольника, и печатающую его площадь
 * * Посчитайте и периметр
 * Считать, что длина и ширина – вещественные числа
 * <p>
 * В задаче про площадь прямоугольника вывести длину,
 * ширину и площадь прямоугольника при помощи одного
 * printf
 * • * Вывести там же и периметр
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для вычисление периметра и площади прямоугольника, необходимы значения сторон");
        System.out.println("Введите длину:");
        double a = scanner.nextDouble();

        System.out.println("Введите ширину:");
        double b = scanner.nextDouble();

        double perimeter = 2 * (a + b);
        double area = a * b;

        System.out.printf("Для прямоугольника со сторонами %.2f и %.2f" +
                " периметр составляет: %.2f, а площадь : %.2f", a, b, perimeter, area);
    }
}
