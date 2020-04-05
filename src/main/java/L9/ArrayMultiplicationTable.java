package L9;

import java.util.Scanner;

/**
 * L9: Таблица умнож массив
 * <p>
 * Написать функцию, которая создает двумерный массив с
 * таблицей умножения
 * • Размер таблицы должен быть параметром функции
 * • Вызвать функцию и распечатать результат в main
 */
public class ArrayMultiplicationTable {
    public static int[][] getArraysMultiplicationTable(int dimension) {
        int[][] array = new int[dimension][dimension];

        for (int i = 0; i < dimension; ++i) {
            for (int j = 0; j < dimension; ++j) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println("Таблица умножения");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте размерность:");
        int dimension = scanner.nextInt();

        int[][] multiplicationTable = getArraysMultiplicationTable(dimension);

        for (int[] numbers : multiplicationTable) {
            for (int number : numbers) {
                System.out.print(number + ", ");
            }

            System.out.println();
        }
    }
}
