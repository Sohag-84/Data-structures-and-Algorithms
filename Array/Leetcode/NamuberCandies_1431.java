package Array.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class NamuberCandies_1431 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        int sum = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            sum = candies[i] + extraCandies;
            if (sum < max) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
