package Binary_Search.Code;

//Number of time a sorted array is rotated using binary search
public class RotationCounts {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2 };
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        // if (pivot == -1) {
        // return 0;
        // } else {
        // return (pivot + 1);
        // }
        // if pivot value = -1 then return (pivot+1) => -1+1 = 0
        // other wise return value after calculation
        return pivot + 1;
    }

    // user for duplicates value
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here

            // --> case-1
            // --> mid<end. otherwise mid+1 condition will be shown
            // index array out of bounds exception, if mid will be the last element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // --> case-2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // -->case-3
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                // if arr[mid] > arr[start]
                start = mid + 1;
            }
        }
        return -1;
    }

    // user this when array contains duplicates values
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here

            // --> case-1
            // --> mid<end. otherwise mid+1 condition will be shown
            // index array out of bounds exception, if mid will be the last element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // --> case-2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // -->case-3
            // if elements at start, middle and end are equal, then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[start]) {
                // skip the duplicates
                // NOTE: What if these elements at start and end were the pivot?

                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;

            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
