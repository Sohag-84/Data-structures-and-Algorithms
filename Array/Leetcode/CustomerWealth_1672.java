package Array.Leetcode;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class CustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int result = maximumWealth(accounts);
        System.out.println("result: " + result);

    }

    static int maximumWealth(int[][] accounts) {
        int[] temp = new int[accounts.length];
        int max = temp[0];
        int sum = 0;
        for (int row = 0; row < accounts.length; row++) {
            sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];
                temp[row] = sum;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        return max;
    }
}