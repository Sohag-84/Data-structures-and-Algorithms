package Linear_Serach;

public class SearchIntValue {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 5, 98, 90, 23 };
        int targetItem = 8;
        int result = lenearSearch(arr, targetItem);
        boolean result2 = lenearSearch2(arr, targetItem);

        System.out.println("Item found at "+result+" index");
        System.out.println("Is item found? "+result2);
    }

    // search the target item and return true,false
    static boolean lenearSearch2(int[] arr, int targetItem) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == targetItem) {
                return true;
            }
        }
        return false;
    }

    // search the target item and return find index
    static int lenearSearch(int[] arr, int targetItem) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == targetItem) {
                return index;
            }
        }
        return -1;
    }

}
