package Array.PracticeCode;

import java.util.Arrays;

public class ChangeArrayValue {
    public static void main(String[] args) {
        int[] arr = { 102, 33, 40, 5, 60, 70, 8 };
        System.out.println("Without changing array value:" + Arrays.toString(arr));

        changeValue(arr, 1, 1);
        System.out.println("After changing array value:" + Arrays.toString(arr));
    }

    static void changeValue(int[] arr, int index, int value) {
        arr[index] = value;
    }
}
