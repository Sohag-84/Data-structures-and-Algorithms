package Binary_Search.Problem_solve;

// https://www.naukri.com/code360/problems/lower-bound_8165382?leftPanelTabValue=SUBMISSION

public class LowerBound_1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7, 8, 9 };
        System.out.println(lowerBoundSearch(arr, 0));
    }

    static int lowerBoundSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
