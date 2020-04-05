package L2;

/**
 * Лекция 2: строки
 *
 * 1. Вывести при помощи одного вызова System.out.println
 * сразу несколько строк при помощи перевода строки
 * 2. Вывести следующие строки:
 * “30” августа 2014г.
 * C:\Windows\System32\Drivers\etc\hosts
 * 3. Посчитать некоторое выражение и распечатать его
 * результат в виде строки. Вместо 4 – ваш результат:
 * Результат = 4
 */
public class PrintMultipleLines {
    public static void main(String[] args) {
        // 1
        System.out.println("Первая строка" + System.lineSeparator() +
                "Вторая строка" + System.lineSeparator());

        // 2
        System.out.println("\"30\" августа 2014г." + System.lineSeparator() +
                "C:\\Windows\\System32\\Drivers\\etc\\hosts" + System.lineSeparator());

        // 3
        int a = 5;
        int b = 9;
        int result = a * b;
        System.out.println("Результат = " + result);
    }
}
