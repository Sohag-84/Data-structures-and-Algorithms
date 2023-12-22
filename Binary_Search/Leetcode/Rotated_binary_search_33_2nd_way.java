package Binary_Search.Leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Rotated_binary_search_33_2nd_way {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Sorted Array");
        int[] arr = { 4, 5, 6, 7, 8, 9, 9, 0, 1, 2 };
        int pivot = findPivotWithDuplicates(arr);
        int result = search(arr, 4);
        System.out.println("Pivot in this array is: " + pivot);
        System.out.println("Result: " + result);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        // if you didn't find the pivot, that means the array isn't rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found, you founded two(2) ascending sorted arrays
        // -->case-1
        if (nums[pivot] == target) {
            return pivot;
        }
        // -->case-2
        if (target >= nums[0]) {
            // reduce the searching space
            return binarySearch(nums, target, 0, pivot - 1);
        }
        // if (target < nums[0]) {
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        // }
    }

    // this will not work in duplicate values
    // static int findPivot(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // // 4 cases over here

    // // --> case-1
    // // --> mid<end. otherwise mid+1 condition will be shown
    // // index array out of bounds exception, if mid will be the last element
    // if (mid < end && arr[mid] > arr[mid + 1]) {
    // return mid;
    // }
    // // --> case-2
    // if (mid > start && arr[mid] < arr[mid - 1]) {
    // return mid - 1;
    // }
    // // -->case-3
    // if (arr[mid] < arr[start]) {
    // end = mid - 1;
    // } else {
    // // if arr[mid] > arr[start]
    // start = mid + 1;
    // }
    // }
    // return -1;
    // }

    // this will work in duplicate values
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

    static int binarySearch(int[] arr, int target, int start, int end) {

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
