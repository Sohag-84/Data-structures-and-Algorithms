package Linear_Serach;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 5, 98, 90, 23 };
        int targetItem = 12;
        int result = lenearSearch(arr, targetItem, 2, 4);

        if (result >= 0) {
            System.out.println("Item found at " + result + " index");
        } else {
            System.out.println("Item not found in this range");
        }

    }

    // search the target item and return find index
    static int lenearSearch(int[] arr, int targetItem, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == targetItem) {
                return index;
            }
        }
        return -1;
    }
}
