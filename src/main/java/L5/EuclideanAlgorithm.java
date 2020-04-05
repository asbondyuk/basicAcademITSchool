//package send;
//
//import java.util.Scanner;
//
///**
// * L5: Алгоритм Евклида
// * <p>
// * Задача про НОД
// * • Необходимо реализовать рекурсивную версию в
// * виде функции
// * b, если a % b = 0
// * НОД a, b = ቊ
// * НОД b, a % b иначе,
// * • где x % y – остаток от деления x на y
// */
//public class EuclideanAlgorithm {
//    public static int calculationEuclideanAlgorithm(int a, int b) {
//        if (a % b == 0) {
//            return b;
//        }
//
//        return calculationEuclideanAlgorithm(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Нахождение наибольшего общего делителя алгоритмом Евклида");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число");
//        int a = scanner.nextInt();
//
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//
//        if (a == 0 && b == 0) {
//            System.out.println("НОД искать нельзя (хотя бы одно из чисел должно быть не 0)");
//            return;
//        }
//
//        int biggestCommonDivider = b > 0 ? calculationEuclideanAlgorithm(a, b) : calculationEuclideanAlgorithm(b, a);
//        System.out.printf("Наибольший общий делитель чисел %d и %d равен %d", a, b, biggestCommonDivider);
//    }
//}
