package Binary_Search.Leetcode;

//https://leetcode.com/problems/find-in-mountain-array/
public class Find_in_mountain_array_1095 {
    public static void main(String[] args) {
        System.out.println("Find in mountain array");
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int result = search(arr, 3);
        System.out.println(result);
    }

   static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (peak != -1) {
            return firstTry;
        } else {
            // search the value in second half
            return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);

        }
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decending part of array
                // this may be ans, but look at left
                // this is why end != mid-1
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the
        // two(2) checks
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointin to just one element that is maximum one because
        // that is what the checks.
        // --> more elaboration: at every point of time for start and end, they have the
        // best possible answer till that time.
        // and if we are saying that only one item is remining hence because of above
        // line that is the best possible answer

        return start; // or return end as both are equal
    }

    // return the index
    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
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
