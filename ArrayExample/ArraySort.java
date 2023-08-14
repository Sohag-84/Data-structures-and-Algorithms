package ArrayExample;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = { 102, 32, 4, 5, 60, 70 };

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted arralist: " + Arrays.toString(arr));

        // second largest value in an array
        System.out.println(arr[arr.length - 2]);
    }
}
