package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearIntegerSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 111, 112, 123, 1234, 1223, 123};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number to be searched : ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int result = linear(arr, target);

        if (result != -1) {
            System.out.println("The item found at: " + result);
        } else {
            System.out.println("item not found");
        }
    }


        static int linear ( int[] arr, int target){
            for (int row = 0; row < arr.length; row++) {
                if (arr[row] == target) {
                    return row;
                }
            }
            return -1;
        }
}