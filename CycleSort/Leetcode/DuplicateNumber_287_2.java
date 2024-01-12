package CycleSort.Leetcode;

//https://leetcode.com/problems/find-the-duplicate-number/description/

public class DuplicateNumber_287_2 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        int result = findDuplicate(arr);
        System.out.println("Duplicate Number in this Array is: " + result);
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int currectIndex = arr[i] - 1;
                if (arr[i] != arr[currectIndex]) {
                    swap(arr, i, currectIndex);
                } else {
                    //this is your answer
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
