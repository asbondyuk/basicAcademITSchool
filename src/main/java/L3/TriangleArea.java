package L3;

import java.util.Scanner;

/**
 * L3: Площадь треугольника
 * <p>
 * Прочитать с консоли координаты трёх точек на плоскости:
 * (x1, y1), (x2, y2), (x3, y3)
 * Вычислить и вывести на экран площадь данного треугольника
 * Для вычисления площади можно воспользоваться формулой Герона
 * <p>
 * Проверить на случай, когда эти точки лежат на одной прямой – в этом
 * случае вычислять площадь не нужно, а нужно вывести сообщение об
 * этом
 * Для вычисления корня использовать команду
 * Math.sqrt(значение)
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для вычисления площади треугольника введите координаты вершин");

        System.out.println("1 вершина (A), координата X:");
        double aX = scanner.nextDouble();

        System.out.println("1 вершина (A), координата Y:");
        double aY = scanner.nextDouble();

        System.out.println("2 вершина (B), координата X:");
        double bX = scanner.nextDouble();

        System.out.println("2 вершина (B), координата Y:");
        double bY = scanner.nextDouble();

        System.out.println("3 вершина (C), координата X:");
        double cX = scanner.nextDouble();

        System.out.println("3 вершина (C), координата Y:");
        double cY = scanner.nextDouble();

        // проверка точек на одной прямой
        // погрешность для сравнения вещественных чисел
        final double epsilon = 1.0e-10;
        if (Math.abs((cX - aX) * (bY - aY) - (cY - aY) * (bX - aX)) < epsilon) {
            System.out.println("Не треугольник: точки лежат на одной прямой");
            return;
        }

        double sideAB = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));
        double sideBC = Math.sqrt(Math.pow(bX - cX, 2) + Math.pow(bY - cY, 2));
        double sideAC = Math.sqrt(Math.pow(aX - cX, 2) + Math.pow(aY - cY, 2));
        double halfPerimeter = (sideAB + sideBC + sideAC) / 2;

        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideAB)
                * (halfPerimeter - sideBC) * (halfPerimeter - sideAC));

        System.out.printf("Площадь треугольника составляет: %.2f", triangleArea);
    }
}
