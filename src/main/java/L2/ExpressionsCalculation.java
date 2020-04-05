package L2;

/**
 * Лекция 2: вычисление выражений
 */
public class ExpressionsCalculation {
    public static void main(String[] args) {
        double x = 3 - (56 - 12) / 44 * (4 / 2);
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);

        System.out.printf("x = %f %ny = %f %nz = %f", x, y, z);
    }
}
