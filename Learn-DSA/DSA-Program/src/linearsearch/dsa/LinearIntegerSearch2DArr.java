package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearIntegerSearch2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 8},
                {20, 40, 60},
                {300, 500, 700, 900, 400},
                {11, 33, 566, 77, 88}
        };
        System.out.println(Arrays.deepToString(arr));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int target = in.nextInt();
        linear(arr, target);

    }
    static void linear(int[][] arr, int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (value == arr[row][col]){
//                    System.out.println("Item found at index: [" + row + "][" + col + "]");
                    System.out.println("Item found at index: "+ Arrays.toString(new int[]{row, col}));
                    return;
                }
            }
        }
        System.out.println("Invalid input!!!");
    }

}
