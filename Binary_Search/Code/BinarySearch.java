package Binary_Search.Code;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -12, 1, 5, 7, 8, 9, 11, 13, 22, 30 };
        int result = binarySearch(arr, 7);

        if (result >= 0) {
            System.out.println("Index found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2; // this may execced the int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }

        return -1;
    }
}
