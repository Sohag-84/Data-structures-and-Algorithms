package ArrayExample.Leetcode;

public class CheckStringPangram_1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("hdz"));
    }

    static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
         }
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i)<0) {
                return false;
            } 
        }
        return true;
    }
}
