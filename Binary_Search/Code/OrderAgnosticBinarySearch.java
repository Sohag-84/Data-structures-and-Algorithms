package Binary_Search.Code;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] ascArr = { -12, 1, 5, 7, 8, 9, 11, 13, 22, 30 };
        int[] dscArr = { 40, 33, 30, 23, 22, 20, 15, 7, 2 };
        int result = orderAgnosticBinarySearch(dscArr, 33);

        if (result >= 0) {
            System.out.println("Index found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }

    // return the index
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending

        // boolean isAsc;
        // if (arr[start] < arr[end]) {
        // isAsc = true;
        // } else {
        // isAsc = false;
        // }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
