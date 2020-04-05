import java.util.Scanner;

/**
 * Прочитать с консоли строку с названием команды
 * • Если ввели слово print, то прочитать с консоли еще одну
 * строку, и напечатать ее
 * • Если ввели слово sum, то прочитать с консоли два
 * вещественных числа, и вывести их сумму
 * • Если ввели что-то другое, то напечатать, что это
 * неизвестная команда
 * • Использовать switch
 */
public class ReadInstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Чтение команд с консоли");
        System.out.println("Введите команду:");
        String instruction = scanner.nextLine().trim();

        switch (instruction) {
            case "print":
                System.out.println("Введите еще одну команду:");
                String instructionNew = scanner.nextLine().trim();
                System.out.println("Ваша команда: " + instructionNew);
                break;
            case "sum":
                System.out.println("Введите 2 числа для сложения:");
                System.out.println("Введите первое число:");
                double firstNumber = scanner.nextDouble();

                System.out.println("Введите второе число:");
                double secondNumber = scanner.nextDouble();

                System.out.printf("Сумма чисел %f и %f составляет: %f", firstNumber, secondNumber,
                        firstNumber + secondNumber);
                break;
            default:
                System.out.println("Неизвестная команда: " + instruction);
        }
    }
}
