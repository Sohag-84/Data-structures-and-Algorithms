package CycleSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // =>array element must be 1-N number. otherwise it doesn't not work.
        /// for 1-N array element sort
        int arr1[] = { 2, 5, 1, 4, 3 };
        sort(arr1);
        System.out.println("1-N array element sort: " + Arrays.toString(arr1));

        // =>array element must be 0-N number. otherwise it doesn't not work.
        /// for 0-N array element sort
        int arr[] = { 4, 2, 3, 1, 0 };
        sort2(arr);
        System.out.println("0-N array element sort: " + Arrays.toString(arr));
    }

    /// for 1-N array sort
    static void sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                swap(arr, i, correctPosition);
            } else {
                i++;
            }
        }
    }

    /// for 0-N array sort
    static void sort2(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[], int firstItem, int secondItem) {
        int temp = arr[firstItem];
        arr[firstItem] = arr[secondItem];
        arr[secondItem] = temp;
    }
}
