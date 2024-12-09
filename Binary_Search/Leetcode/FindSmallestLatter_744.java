package Binary_Search.Leetcode;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLatter_744 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };

        var result = nextGreatestLetter(letters, 'j');

        System.out.println(result);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2; // this may execced the int range
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        // if(start == letters.length){
        // return letters[0];
        // }

        // return letters[start];

        return letters[start % letters.length];
    }

}
