package L6;

import java.util.Scanner;

/**
 * L6: Стоимость заказа
 * <p>
 * Написать функцию для расчета стоимости заказа с учетом
 * скидок
 * • Всего есть два вида товаров, в заказ может входить
 * некоторое количество товаров одного типа и другого типа
 * • Скидка 5% начисляется, если суммарное количество
 * товаров в заказе не меньше 10
 * • Скидка 5% начисляется, если суммарная стоимость заказа
 * не меньше 1000 рублей
 * • Если выполняются оба условия, то скидка 10% от начальной
 * стоимости
 */

public class OrderCost {
    public static double calculateOrderCost(int product1Count, double product1Cost, int product2Count, double product2Cost) {
        int orderDiscount = 0;

        final int quantityForDiscount = 10;
        final int quantityDiscountPercent = 5;
        if (product1Count + product2Count >= quantityForDiscount) {
            orderDiscount += quantityDiscountPercent;
        }

        final int costForDiscount = 1000;
        final int costDiscountPercent = 5;
        double orderCost = product1Count * product1Cost + product2Count * product2Cost;
        if (orderCost >= costForDiscount) {
            orderDiscount += costDiscountPercent;
        }

        final int maxDiscountPercentage = 100;

        return orderCost * (1 - (double) orderDiscount / maxDiscountPercentage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычисление стоимости заказа");

        System.out.println("Введите количество первого товара:");
        int product1Count = scanner.nextInt();

        System.out.println("Введите стоимость первого товара:");
        double product1Cost = scanner.nextDouble();

        System.out.println("Введите количество второго товара:");
        int product2Count = scanner.nextInt();

        System.out.println("Введите стоимость второго товара:");
        double product2Cost = scanner.nextDouble();

        double discountedOrderCost = calculateOrderCost(product1Count, product1Cost, product2Count, product2Cost);
        System.out.printf("Итоговая стоимость заказа: %.2f", discountedOrderCost);
    }
}
