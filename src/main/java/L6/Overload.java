package L6;

/**
 * L6: Перегрузка
 * <p>
 * Объявить в классе несколько функций с именем getTypeSize
 * • Каждая функция должна принимать один аргумент одного
 * из следующих типов: byte, short, int, long, float, double
 * • Функция должна возвращать int – количество байт,
 * требуемых под переменную данного типа
 * • В функции main сделать по одному примеру использования
 * для каждой перегруженной функции
 * • В этой задаче может быть warning, что аргумент не
 * используется, его не исправляем
 */

public class Overload {
    public static int getTypeSize(byte number) {
        return 1;
    }

    public static int getTypeSize(short number) {
        return 2;
    }

    public static int getTypeSize(int number) {
        return 4;
    }

    public static int getTypeSize(long number) {
        return 8;
    }

    public static int getTypeSize(float number) {
        return 4;
    }

    public static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println("Пример использования перегрузки метода");

        byte number1 = 10;
        System.out.println("для сохранения числа " + number1 + " используется " + getTypeSize(number1) + " байт");

        short number2 = 1000;
        System.out.println("для сохранения числа " + number2 + " используется " + getTypeSize(number2) + " байт");

        int number3 = 10000000;
        System.out.println("для сохранения числа " + number3 + " используется " + getTypeSize(number3) + " байта");

        long number4 = 1000000000;
        System.out.println("для сохранения числа " + number4 + " используется " + getTypeSize(number4) + " байта");

        float number5 = 1f;
        System.out.println("для сохранения числа " + number5 + " (float) используется " + getTypeSize(number5) + " байта");

        double number6 = 1d;
        System.out.println("для сохранения числа " + number6 + " (double) используется " + getTypeSize(number6) + " байта");
    }
}
