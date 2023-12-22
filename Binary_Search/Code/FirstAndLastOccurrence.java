package Binary_Search.Code;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 6 };
        int[] ans = { -1, -1 };
        int start = firstOccurrence(arr, 5);
        int end = lastOccurrence(arr, 5);
        ans[0] = start;
        ans[1] = end;
        System.out.println("Index at: " + Arrays.toString(ans));
        System.out.println("Target item found "+(end-start+1)+" times");

        System.out.println("Element found at: " + Arrays.toString(searchRange(arr, 5)));

    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int startIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);
        ans[0] = startIndex;
        ans[1] = lastIndex;
        return ans;
    }

    static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                //// potential answer is found
                ans = mid;
                // now check another index is found or not in the left side of middle element
                end = mid - 1;
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return ans;
    }

    // for last occurence
    static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                //// potential answer is found
                ans = mid;
                // now check another index is found or not in the right side of middle element
                start = mid + 1;
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return ans;
    }
}
