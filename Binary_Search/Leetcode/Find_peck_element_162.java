package Binary_Search.Leetcode;

//https://leetcode.com/problems/find-peak-element/

public class Find_peck_element_162 {
    public static void main(String[] args) {
        System.out.println("Find peak element");
        int[] arr = { 1, 2, 1, 3, 5, 6, 4 };
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // you are in decending part of numsay
                // this may be ans, but look at left
                // this is why end != mid-1
                end = mid;
            } else {
                // you are in ascending part of numsay
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
}
