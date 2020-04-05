package L9;

import java.util.Arrays;

/**
 * L9: Массив строк в верх. рег
 * <p>
 * Написать функцию, которая принимает массив строк и
 * изменяет его, присваивая элементам эти же строки, но в
 * которых все символы заглавные
 * • Для этого использовать метод класса String toUpperCase()
 * • Пример вызова toUpperCase для строки:
 * String s = “hello”;
 * String b = s.toUpperCase(); // “HELLO”
 */
public class ToUpperCaseStringsArray {
    public static void convertToUpperCaseStringsArray(String[] strings) {
        for (int i = 0; i < strings.length; ++i) {
            strings[i] = strings[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] strings = {"hello", "world", "JaVa"};

        convertToUpperCaseStringsArray(strings);

        System.out.println(Arrays.toString(strings));
    }
}
