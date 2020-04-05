package L12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * L12: Число вхождений
 * <p>
 * Прочитать текст из файла, и написать функцию, которая
 * считает количество вхождений некоторой строки в этот
 * текст без учета регистра символов
 * • Использовать цикл и indexOf, который принимает
 * начальный индекс, с которого искать
 */
public class EntriesCount {
    public static int getEntriesCount(String fileName, String searchString) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            String lowerCaseSearchString = searchString.toLowerCase();
            int searchStringLength = lowerCaseSearchString.length();
            int entriesCount = 0;

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine().toLowerCase();

                int foundIndex = string.indexOf(lowerCaseSearchString);

                while (foundIndex != -1) {
                    ++entriesCount;
                    foundIndex = string.indexOf(lowerCaseSearchString, foundIndex + searchStringLength);
                }
            }

            return entriesCount;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Подсчет количества вхождений");

        String fileName = "input.txt";
        String searchString = "w";

        System.out.println("Количество вхождений \"" + searchString + "\" в файле: " + getEntriesCount(fileName, searchString));
    }
}
