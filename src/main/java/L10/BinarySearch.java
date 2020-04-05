package L10;

/**
 * L10: Бинарный поиск без рекурсии
 */
public class BinarySearch {
    public static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (x == a[middle]) {
                return middle;
            }

            if (x > a[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 10, 12};
        int x1 = 6;
        int x2 = 7;

        System.out.println(x1 + " находится на " + binarySearch(array, x1) + " месте");
        System.out.println(x2 + " находится на " + binarySearch(array, x2) + " месте");
    }
}
