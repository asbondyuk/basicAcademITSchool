/**
 * L4
 * <p>
 * 1) Найти сумму чисел от 0 до 9
 * <p>
 * 2) Переделать программу, чтобы найти сумму от 3 до
 * 21 включительно
 * <p>
 * 3) Переделать программу, чтобы найти сумму только
 * четных чисел от 3 до 21 включительно
 * <p>
 * 4) Дополнительно найти количество четных чисел от 3
 * до 21 включительно
 */
public class Sum {
    public static void main(String[] args) {
        // 1
        int slice1L = 0;
        int slice1R = 9;
        int sum1 = 0;
        for (; slice1L <= slice1R; slice1L++) {
            sum1 += slice1L;
        }

        System.out.printf("Сумма чисел от %d до %d составляет %d", slice1L, slice1R, sum1);
        System.out.println();

        // 2
        int slice2L = 3;
        int slice2R = 21;
        int sum2 = 0;
        for (; slice2L <= slice2R; slice2L++) {
            sum2 += slice1L;
        }

        System.out.printf("Сумма чисел от %d до %d составляет %d", slice2L, slice2R, sum2);
        System.out.println();

        // 3
        int slice3L = 3;
        int slice3R = 21;
        int sum3 = 0;
        for (; slice3L <= slice3R; slice3L++) {
            if (slice3L % 2 == 0) {
                sum3 += slice3L;
            }
        }

        System.out.printf("Сумма четных чисел от %d до %d включительно составляет %d", slice3L, slice3R, sum3);
        System.out.println();

        // 4
        int slice4L = 3;
        int slice4R = 21;
        int counter = 0;
        for (; slice4L <= slice4R; slice4L++) {
            if (slice4L % 2 == 0) {
                counter++;
            }
        }

        System.out.printf("Количество четных чисел от %d до %d включительно составляет %d", slice4L, slice4R, counter);
        System.out.println();
    }
}
