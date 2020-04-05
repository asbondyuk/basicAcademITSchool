package L4;

import java.util.Scanner;

/**
 * L4: Числа Фибоначчи
 * <p>
 * Написать программу, которая принимает с консоли
 * целое число n и возвращает число Фибоначчи с
 * номером n.
 * • Числа Фибоначчи задаются следующим образом:
 * • fo = 0, f1 = 1, fn = fn-1 + fn-2
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Вычисление n числа Фибоначчи");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n:");
        int n = scanner.nextInt();

        int fibonacciN = 0;
        switch (n) {
            case 0:
                fibonacciN = 0;
                break;
            case 1:
            case 2:
                fibonacciN = 1;
                break;
            default:
                int fibonacci0 = 0;
                int fibonacci1 = 1;
                for (int i = 2; i <= n; i++) {
                    fibonacciN = fibonacci0 + fibonacci1;
                    fibonacci0 = fibonacci1;
                    fibonacci1 = fibonacciN;
                }
        }

        System.out.printf("%d число Фибоначчи: %d", n, fibonacciN);
    }
}
