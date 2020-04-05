package L12;

/**
 * L12: Разбиение строки
 * <p>
 * Разбить строку “1, 2, 3, 4, 5” и получить массив из
 * этих чисел и найти их сумму
 * • Использовать split и Integer.parseInt
 */
public class LineBreak {
    public static void main(String[] args) {
        String string = "1, 2, 3, 4, 5";

        int sum = 0;
        for (String s : string.split(", ")) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
