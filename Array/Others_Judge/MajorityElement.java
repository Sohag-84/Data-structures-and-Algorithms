package Array.Others_Judge;

// https://www.naukri.com/code360/problems/majority-element_6783241?leftPanelTabValue=PROBLEM

public class MajorityElement {
    public static void main(String[] args) {
        int[] v = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
        System.out.println(majorityElement(v));
    }

    public static int majorityElement(int[] v) {
        // Write your code here
        int candidate = 0;
        int vote = 0;

        for (int i = 0; i < v.length; i++) {
            if (vote == 0) {
                candidate = v[i];
            }

            if (candidate == v[i]) {
                vote++;
            } else {
                vote--;
            }
        }
        return candidate;
    }
}
