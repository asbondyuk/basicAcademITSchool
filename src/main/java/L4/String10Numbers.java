package L4;

/**
 * L4: ДЗ 10 чисел в строке
 * <p>
 * Распечатать числа от 1 до 100 при помощи цикла while, но
 * выводить по 10 чисел в строке, дальше делать перевод
 * строки
 * • 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 17 18 19 20
 */
public class String10Numbers {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        int i = begin;

        while (i <= end) {
            System.out.printf("%4d", i);

            if (i % 10 == 0) {
                System.out.println();
            }

            ++i;
        }
    }
}
