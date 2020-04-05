package L6;

import java.util.Scanner;

/**
 * L6 : ДЗ Перевод температур
 * <p>
 * Написать программу, которая переводит температуру из
 * градусов Цельсия в градусы Кельвина и Фаренгейта
 * • Прочитать число – температуру в шкале Цельсия и
 * напечатать две строки – в градусах Кельвина и Фаренгейта
 * • Перевод градусов Цельсия в градусы Кельвина и перевод в
 * градусы Фаренгейта оформить отдельными функциями
 * • Формулы найти в интернете
 */
public class TemperatureTranslation {
    public static double convertFromCelsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double convertFromCelsiusToFahrenheit(double celsiusTemperature) {
        return 9 * celsiusTemperature / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру в Цельсиях для перевода в Кельвина и Фаренгейта:");
        double celsiusTemperature = scanner.nextDouble();

        System.out.println("Температура в Кельвинах: " + convertFromCelsiusToKelvin(celsiusTemperature));
        System.out.println("Температура по Фаренгейту: " + convertFromCelsiusToFahrenheit(celsiusTemperature));
    }
}
