package L10;

/**
 * L10: Возведение в степень
 * <p>
 * Написать рекурсивную функцию возведения целого числа в
 * целую неотрицательную степень (упрощенный аналог
 * Math.pow)
 * • Нельзя использовать Math.pow
 * • Когда закончите – напишите тут же нерекурсивную
 * функцию
 */
public class Exponentiation {
    public static int exponentiate(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return number * exponentiate(number, power - 1);
    }

    public static int exponentiateWithoutRecursion(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponentiate(4, 3));
        System.out.println(exponentiateWithoutRecursion(4, 3));
    }
}
