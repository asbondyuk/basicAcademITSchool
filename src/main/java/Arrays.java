public class Arrays {
    public static double arrayMax(double[] array) {
        final double epsilon = 1.0e-10;
        double max = array[0];
        for (double value : array) {
            if (value - max > epsilon) {
                max = value;
            }
        }
        return max;
    }

    public static int findArrayNumber(int[] array, int number) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }


    public static int exponentiation(int number, int degree) {
        if (degree == 0) {
            return 1;
        } else if (degree == 1) {
            return number;
        } else {
            return number * exponentiation(number, degree - 1);
        }
    }

    public static int exponentiationNoRec(int number, int degree) {
        if (degree == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponentiation(3, 3));
    }
}
