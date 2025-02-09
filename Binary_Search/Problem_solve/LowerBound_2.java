package Binary_Search.Problem_solve;

// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154    

public class LowerBound_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7, 8, 9 };
        System.out.println(lowerBoundSearch(arr, 5));
    }

    static int lowerBoundSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return ans;
    }
}
