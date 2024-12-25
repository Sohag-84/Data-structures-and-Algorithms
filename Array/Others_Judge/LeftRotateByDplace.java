package Array.Others_Judge;

import java.util.*;

public class LeftRotateByDplace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int d) {
        int n = 7;
        if (n == 0) {
            return;
        }

        d = d % n;

        if (d == 0) {
            return;
        }

        int[] temp = new int[d];
        // step 1: Copying first d elements
        // in the temporary array:
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // step 2: Shift last (n-d) elements
        // to the left by d places in the given array:
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // step 3: Place the elements of the temporary
        // array in the last d places of the given array:

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }

}
