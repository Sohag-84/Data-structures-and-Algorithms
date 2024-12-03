package ArrayExample.Leetcode;

import java.util.Arrays;
import java.util.List;

public class CountItemMatchingRule_1773 {
    public static void main(String[] args) {
        String ruleKey = "type";
        String ruleValue = "phone";

        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("phone", "gold", "iphone"),
                Arrays.asList("computer", "silver", "phone"));

        int count = countMatches(items, ruleKey, ruleValue);
        System.out.println(count);

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("color")) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("name")) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;

                }
            }
        }
        return count;
    }
}
