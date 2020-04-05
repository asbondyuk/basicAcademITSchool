package classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork12 {
/*    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100; ++i) {
            stringBuilder.append(i).append(",");

            if (i == 99) {
                stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
            }
        }

//        for (int i = 0; i < 99; ++i) {
//            stringBuilder.append(i).append(",");
//        }
//
//        stringBuilder.append("99");

        String result = stringBuilder.toString();

        System.out.println(result);
    }

*/

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));

        int numbersCount = scanner.nextInt();
        double[] numbers = new double[numbersCount];

        for (int i = 0; i < numbersCount; ++i) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}