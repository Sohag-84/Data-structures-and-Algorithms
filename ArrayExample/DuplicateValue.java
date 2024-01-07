package ArrayExample;

public class DuplicateValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 4 };

        System.out.println("Duplicate element in an array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
