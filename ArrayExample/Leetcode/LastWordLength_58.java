package ArrayExample.Leetcode;

public class LastWordLength_58 {
    public static void main(String[] args) {
        String s = "Injamul Haq Sohag";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int n = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                n = str[i].length();
            }
        }
        return n;
    }
}
