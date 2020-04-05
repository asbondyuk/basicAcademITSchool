package L10;

/**
 * L10: Бинарный поиск с рекурсией
 */
public class RecursionBinarySearch {
    public static int recursionBinarySearch(int[] a, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (x == a[middle]) {
            return middle;
        }

        if (x > a[middle]) {
            return recursionBinarySearch(a, middle + 1, right, x);
        }

        return recursionBinarySearch(a, left, middle - 1, x);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        int left = 0;
        int right = array.length - 1;
        int x1 = 2;
        int x2 = 3;

        System.out.println(x1 + " находится на " + recursionBinarySearch(array, left, right, x1) + " месте");
        System.out.println(x2 + " находится на " + recursionBinarySearch(array, left, right, x2) + " месте");
    }
}
