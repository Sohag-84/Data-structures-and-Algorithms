package Binary_Search.Leetcode;

//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 2;
        int postion = searchInsert(arr, target);
        System.out.println("Insert position: " + postion);
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
