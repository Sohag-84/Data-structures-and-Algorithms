package Array.PracticeCode;

public class SmallestNumber {

    public static void main(String[] args) {
        int arr[] = { 102, 32, 4, 5, 60, 70 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Smallest Number: " + min);
    }
}
