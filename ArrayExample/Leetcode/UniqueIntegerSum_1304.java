package ArrayExample.Leetcode;

import java.util.Scanner;
import java.util.Arrays;

public class UniqueIntegerSum_1304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

    static int[] sumZero(int n) {
        int[] arr = new int[n];

        if (n % 2 == 0) {
            for (int i = 0; i < n; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
        }
        return arr;
    }
}
