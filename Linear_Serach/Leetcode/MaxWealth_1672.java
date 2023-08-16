package Linear_Serach.Leetcode;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 },
        };
        int result = maximumWealth(arr);
        System.out.println(result);
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // bankAccount = col
        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int rowSum = 0;
            for (int bankAccount = 0; bankAccount < accounts[person].length; bankAccount++) {
                rowSum += accounts[person][bankAccount];
                if (maxWealth < rowSum) {
                    maxWealth = rowSum;
                }
            }
        }
        return maxWealth;
    }
}
