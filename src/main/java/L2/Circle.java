package L2;

/**
 * Лекция 2
 * <p>
 * Задача на дом «Окружность» + комментарии
 * <p>
 * Написать программу, которая вычисляет и печатает:
 * 1) Площадь круга и длину окружности с заданным радиусом.
 * Значение радиуса задать самим в тексте программы
 * 2) Посчитать радиус окружности с заданной площадью круга.
 * Значение площади задать самим в тексте программы
 * 3) * Посчитать площадь сектора с заданными радиусом и углом
 * в градусах.
 * <p>
 * Значения радиуса и угла задать в тексте программы
 * • Использовать класс Math: возведение в степень, квадратный
 * корень, константа Пи и др.
 * • Имена переменных должны быть хорошими, не ориентируемся
 * на математические обозначения
 * <p>
 * TODO Выяснить и реализовать корректную логику расчета сектора для п.3
 */
public class Circle {
    public static void main(String[] args) {
        //1
        int circleRadius = 7;
        double calculatedCircleAreaByRadius = Math.PI * Math.pow(circleRadius, 2);
        double circleCalculatedPerimeterByRadius = 2 * Math.PI * circleRadius;

        System.out.println("1) Площадь круга радиуса " + circleRadius +
                " составляет " + calculatedCircleAreaByRadius +
                ". Периметр : " + circleCalculatedPerimeterByRadius);

        //2
        int areaCircle = 10;
        double circleCalculatedRadiusByArea = Math.sqrt(areaCircle / Math.PI);
        double circleCalculatedPerimeterByArea = 2 * Math.PI * circleCalculatedRadiusByArea;

        System.out.println("2) Периметр круга площади " + areaCircle +
                " составляет " + circleCalculatedPerimeterByArea +
                ".");

        //3
        int radius = 1;
        int angleInDegrees = 359;
        int circleTotalDegrees = 360;

        double circleArea = Math.PI * Math.pow(radius, 2);
        //логика расчета сектора не ясна - для случая angleInDegrees > 360
        //- площадь сектора будет больше площади круга
        double circlePart = (double) angleInDegrees / circleTotalDegrees;
        double sectorArea = circleArea * circlePart;

        System.out.println("3) Площадь сектора круга радиуса " + radius +
                " и " + angleInDegrees + " угла в градусах" +
                " составляет " + sectorArea);
    }
}
