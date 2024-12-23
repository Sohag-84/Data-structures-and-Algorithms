package Array.Leetcode;

// https://leetcode.com/problems/flipping-an-image/description/

import java.util.Arrays;

public class FlippingImage_832 {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
        };
        int[][] result = flipAndInvertImage(image);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] tempArr = new int[image.length][image.length];
        /// reverse the array
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;
            }
            tempArr[i] = image[i];
        }
        /// replace value 0->1 and 1->0
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 0; j < tempArr[i].length; j++) {
                if (tempArr[i][j] == 0) {
                    tempArr[i][j] = 1;
                } else {
                    tempArr[i][j] = 0;
                }
            }
        }
        return tempArr;
    }
}
