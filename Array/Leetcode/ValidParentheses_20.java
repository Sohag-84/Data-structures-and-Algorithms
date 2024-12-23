package Array.Leetcode;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}
