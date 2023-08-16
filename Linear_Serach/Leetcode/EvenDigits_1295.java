package Linear_Serach.Leetcode;

//Leetcode 1295 number solve
//pb.-> Find Numbers with even Number of digits
//-> Given an array nums of integers, return how many
//of them contain an even number of digits

public class EvenDigits_1295 {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 5, 98, 90, 235 };
        int result = findNumbers(arr);
        System.out.println(result);

        System.out.println(digits(0));

        System.out.println(digits2(23987897));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    // function to check weather a number contains
    // even digits or not
    static boolean even(int num) {
        if (digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;
        // conver negetive number to possitive
        if (num < 0) {
            num = num * (-1);
        }

        // note:-> 0 contains 1 digits.So we can set condition
        // otherwise it gives us 0
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // shortcut way to count the number of digits
    static int digits2(int num) {
        if (num < 0) {
            num = num * (-1);
        }
         if(num ==0){
            return 1;
         }
        return (int) (Math.log10(num)) + 1;
    }
}
