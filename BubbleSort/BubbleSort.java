package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, -5, 6 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]) {
        boolean swapped;// so that extra loop is not excecute for sorted array
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap item if the item smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if did not swap for a particular value of i,
            // it means array is sorted
            // hence stop the program
            if (!swapped) {
                break;
            }
        }
    }

}
