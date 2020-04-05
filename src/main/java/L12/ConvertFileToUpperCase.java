package L12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * L12: Перевод файла в верх.регистр
 * <p>
 * Написать программу, которая читает строки файла,
 * переводит их в верхний регистр и записывает
 * результат во второй файл
 */
public class ConvertFileToUpperCase {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Перевод файла в верхний регистр");

        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"));
             PrintWriter writer = new PrintWriter("output.txt")) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }

        System.out.println("завершен");
    }
}
