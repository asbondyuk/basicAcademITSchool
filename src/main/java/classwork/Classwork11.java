package classwork;

import java.util.Arrays;

public class Classwork11 {
    public static int searchArrayMin(int[] array, int startIndex) {
        int minK = startIndex;
        int minV = array[startIndex];
        for (int i = startIndex + 1; i < array.length; ++i) {
            if (array[i] < minV) {
                minK = i;
                minV = array[i];
            }
        }

        return minK;
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 3, 2, 1};

        for (int i = 0; i < array.length - 1; ++i) {
            int minK = searchArrayMin(array, i);
            int temp = array[i];
            array[i] = array[minK];
            array[minK] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
