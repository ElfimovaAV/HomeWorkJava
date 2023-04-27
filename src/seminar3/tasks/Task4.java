//*Реализовать алгоритм сортировки слиянием

package seminar3.tasks;

import java.util.Arrays;

public class Task4 {
    public static int[] mergesort(int[] array) {
        int n = array.length;
        if (n <= 1) return array;

        int[] left = mergesort(Arrays.copyOfRange(array, 0, n / 2));
        int[] right = mergesort(Arrays.copyOfRange(array, n / 2, n));

        return merge(left, right);
    }

    private static int[] merge(int[] ar1, int[] ar2) {
        int n1 = ar1.length, n2 = ar2.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                array[i] = ar2[i2++];
            } else if (i2 == n2) {
                array[i] = ar1[i1++];
            } else {
                if (ar1[i1] < ar2[i2]) {
                    array[i] = ar1[i1++];
                } else {
                    array[i] = ar2[i2++];
                }
            }
        }
        return array;
    }
}
