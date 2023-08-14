package ArrayExample;

public class MaxNumber {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 4, 5, 60, 7 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max Number: " + max);
    }
}
