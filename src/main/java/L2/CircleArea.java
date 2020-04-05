package L2;

/**
 * Лекция 2: Площадь круга
 * <p>
 * Вычисляет и печатает
 * площадь круга с заданным радиусом.
 * Значение радиуса задать самим в тексте программы
 * Использовать класс Math
 */
public class CircleArea {
    public static void main(String[] args) {
        int circleRadius = 5;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("Площадь круга радиуса " + circleRadius + " составляет " + circleArea);
    }
}
