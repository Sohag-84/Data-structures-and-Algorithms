package ArrayExample;

public class MaxValueWithFuntion {
    public static void main(String[] args) {
        int[] arr = { 102, 33, 40, 5, 60, 70 };

        System.out.println(maxRange(arr, 1, 6));

        System.out.println("Largest value in an array: " + max(arr));

    }

    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];

        if (end > start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
