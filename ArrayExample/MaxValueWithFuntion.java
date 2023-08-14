package ArrayExample;

public class MaxValueWithFuntion {
    public static void main(String[] args) {
        int[] arr = { 102, 33, 40, 5, 60, 70 };

        System.out.println(maxRange(arr, 1, 5));

        System.out.println("Largest value in an array: " + max(arr));

    }

    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
