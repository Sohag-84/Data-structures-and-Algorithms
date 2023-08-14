package ArrayExample;

public class ArraySortWitoutFunction {
    public static void main(String[] args) {
        int arr[] = { 10, 32, 4, 5, 60, 0 };
        int temp;

        // Sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
