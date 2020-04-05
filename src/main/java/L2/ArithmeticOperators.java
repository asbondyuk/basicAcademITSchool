package L2;

/**
 * Лекция 2: арифметические операторы
 * <p>
 * по 1 примеру для каждого оператора для целых
 * чисел и для вещественных чисел, вывести результат в
 * консоль
 * <p>
 * Операторы: + - * /
 * <p>
 * Проверить как работает целочисленное и вещественное
 * деление
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int intA = 16;
        int intB = 3;
        double doubleA = 16.0;
        double doubleB = 3.0;

        System.out.println("A = " + intA);
        System.out.println("B = " + intB);

        System.out.println("Сумма int = " + (intA + intB));
        System.out.println("Разница int = " + (intA - intB));
        System.out.println("Умножение int = " + (intA * intB));
        System.out.println("Деление int = " + (intA / intB));
        System.out.println("Целочисленное деление int = " + (intA % intB));
        System.out.println("Вещественное деление int = " + ((double) intA / intB));

        System.out.println();

        System.out.println("Сумма double = " + (doubleA + doubleB));
        System.out.println("Разница double = " + (doubleA - doubleB));
        System.out.println("Умножение double = " + (doubleA * doubleB));
        System.out.println("Деление double = " + (doubleA / doubleB));
        System.out.println("Целочисленное деление double = " + (doubleA % doubleB));
    }
}
