package L5;

import java.util.Random;
import java.util.Scanner;

/**
 * L5: угадай число
 * <p>
 * Напишите программу-игру, которая делает следующее:
 * • Компьютер загадывает случайное число от 1 до 100
 * включительно
 * • Для генерации случайного числа используйте класс
 * Random
 * • Далее задача пользователя – отгадать число
 * • Вы вводите свою догадку. Если ввели верно, то игра
 * завершается, и компьютер выводит за сколько попыток вы
 * отгадали число
 * • Если ввели неверно, то компьютер должен сообщить,
 * загаданное число больше или меньше
 * • Число попыток у пользователя не ограничено
 */
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Компьютер загадал случайное число от 1 до 100 включительно. Угадайте число");

        int guessedNumber = 1 + new Random().nextInt(100);
        int attemptsCount = 1;

        while (true) {
            int attempt = scanner.nextInt();

            if (attempt == guessedNumber) {
                System.out.printf("Количество попыток для угадывания: %d", attemptsCount);
                return;
            }

            if (attempt > guessedNumber) {
                System.out.println("Меньше. Попробуйте еще раз. Введите число:");
            } else {
                System.out.println("Больше. Попробуйте еще раз. Введите число:");
            }

            ++attemptsCount;
        }
    }
}
