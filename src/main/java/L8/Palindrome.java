package L8;

/**
 * L8: КЗ Палиндром
 * <p>
 * Объявить некоторую строковую переменную в программе
 * • Проверить, что данная строка является палиндромом – то
 * есть читается одинаково слева направо и справа налево.
 * • При проверке не учитывать регистр символов, учитывать
 * только буквы
 * • Пример палиндрома: «Аргентина манит негра»
 * • Требование: сделать без создания новой строки и без
 * удаления символов из строки
 */
public class Palindrome {
    // Одновременно берем элементы слева и справа для сравнения, пропуская пробелы
    public static boolean isPalindrome(String string) {
        if (string.length() == 0) {
            return true;
        }

        int leftIndex = 0;
        int rightIndex = string.length() - 1;

        while (leftIndex < rightIndex) {
            while (!Character.isLetter(string.charAt(leftIndex)) && leftIndex < rightIndex) {
                leftIndex++;
            }

            char leftChar = Character.toLowerCase(string.charAt(leftIndex));

            while (!Character.isLetter(string.charAt(rightIndex)) && rightIndex > leftIndex) {
                --rightIndex;
            }

            char rightChar = Character.toLowerCase(string.charAt(rightIndex));

            if (leftChar != rightChar) {
                return false;
            }

            ++leftIndex;
            --rightIndex;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Проверка: является ли строка палиндромом");

        String string1 = "Аргентина манит негра";
        String string2 = "Аргент234ина манит негра";
        String string3 = "Аргентина";
        String string4 = "шалаш";
        String string5 = "1234567";
        String string6 = "1abc234567";
        String string7 = "Аргентина манит НЕТ                                  негра";

        System.out.println(string1 + " : " + isPalindrome(string1));
        System.out.println(string2 + " : " + isPalindrome(string2));
        System.out.println(string3 + " : " + isPalindrome(string3));
        System.out.println(string4 + " : " + isPalindrome(string4));
        System.out.println(string5 + " : " + isPalindrome(string5));
        System.out.println(string6 + " : " + isPalindrome(string6));
        System.out.println(string7 + " : " + isPalindrome(string7));
    }
}
