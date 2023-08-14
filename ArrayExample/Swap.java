package ArrayExample;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 102, 33, 40, 5, 60, 70, 8 };

        System.out.println("Without swaping value: " + Arrays.toString(arr));
        swapArray(arr, 1, 3);
        System.out.println("After swaping value: " + Arrays.toString(arr));

        System.out.print("\nReverse first way:");
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("\nReverse second way:");
        reverseOthersWay(arr);
        System.out.println(Arrays.toString(arr));
    }

    // for swap specific index value
    static void swapArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reverse the array
    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
    }

    // array reverse another way
    static void reverseOthersWay(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }
}
