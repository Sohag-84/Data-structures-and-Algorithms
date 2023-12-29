package CycleSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // =>array element must be 1-N number. otherwise it doesn't not work
        int arr[] = { 2, 5, 1, 4, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

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

    static void swap(int arr[], int firstItem, int secondItem) {
        int temp = arr[firstItem];
        arr[firstItem] = arr[secondItem];
        arr[secondItem] = temp;
    }
}
