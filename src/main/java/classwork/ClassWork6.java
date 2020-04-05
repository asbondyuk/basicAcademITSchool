package classwork;

import java.util.Scanner;

public class ClassWork6 {
    public static double sum3xAnd4y(double x, double y) {
        return 3 * x + 4 * y;
    }

    public static double average(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; ++i) {
            sum += i;
        }

        int count = end - start + 1;

        return (double) sum / count;
    }

    public static int max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static int min(int a, int b) {
        int min = a > b ? b : a;

        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите x");
        double x1 = scanner.nextFloat();

        System.out.println("Введите y");
        double y1 = scanner.nextFloat();

        System.out.println(sum3xAnd4y(x1, y1));

        System.out.println("Введите x");
        double x2 = scanner.nextFloat();

        System.out.println("Введите y");
        double y2 = scanner.nextFloat();

        System.out.println(sum3xAnd4y(x2, y2));
        System.out.println();
    }
}
