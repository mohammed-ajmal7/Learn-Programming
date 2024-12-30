package linearsearch.dsa;

import java.util.Arrays;

public class MaxIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 8},
                {20, 40, 60},
                {300, 500, 700, 900, 400, 763478256},
                {11, 33, 566, 77, 88, -1, -599}
        };
        System.out.println("Array\n"+ Arrays.deepToString(arr));
        int[] result = findMax(arr);
        System.out.println("The Max value of the Array: " + result[0]);
        System.out.println("the indeces: ["+result[1]+"]"+"["+result[2]+"]");


    }

    static int[] findMax(int[][] arr){
        int maxValue = arr[0][0];
        int maxRow = -1;
        int maxCol = -1;
        for (int row = 1; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (maxValue < arr[row][col]){
                maxValue = arr[row][col];
                maxRow = row;
                maxCol = col;
                }
            }
        }
        if (maxRow == -1) {
            throw new IllegalArgumentException("Array contains no elements");
        }
        return new int[]{maxValue, maxRow, maxCol};
    }
}
