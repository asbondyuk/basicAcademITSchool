package L2;

import java.util.Scanner;

/**
 * Курсовая задача: Квартиры
 */
public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей:");
        int floorsCount = scanner.nextInt();

        System.out.println("Введите количество подъездов:");
        int entrancesCount = scanner.nextInt();

        System.out.println("Введите номер квартиры:");
        int apartmentNumber = scanner.nextInt();

        // проверяем наличие номера квартиры в доме
        final int apartmentsCountPerFloor = 4;
        int apartmentMaxNumber = floorsCount * entrancesCount * apartmentsCountPerFloor;
        if (apartmentMaxNumber < apartmentNumber) {
            System.out.println("Квартиры с таким номером нет");
            return;
        }

        // расчеты, из-за числового решения: if для балансировки крайних значений
        // квартир в подъезде
        int apartmentsCountPerEntrance = floorsCount * apartmentsCountPerFloor;
        int entranceNumber = 1 + ((apartmentNumber - 1) / apartmentsCountPerEntrance);

        // расчет этажа
        int apartmentWithoutEntrances = apartmentNumber - ((entranceNumber - 1) * apartmentsCountPerEntrance);
        int floorNumber = 1 + ((apartmentWithoutEntrances - 1) / apartmentsCountPerFloor);

        // расчет положения
        int apartmentPosition = apartmentNumber % apartmentsCountPerFloor;
        String[] apartmentPositionOnFloor = {"ближняя справа", "ближняя слева", "дальняя слева", "дальняя справа"};
        String positionOnFloor = apartmentPositionOnFloor[apartmentPosition];

        System.out.printf("Подъезд: %d, Этаж: %d, Позиция: %s", entranceNumber, floorNumber, positionOnFloor);
    }
}
