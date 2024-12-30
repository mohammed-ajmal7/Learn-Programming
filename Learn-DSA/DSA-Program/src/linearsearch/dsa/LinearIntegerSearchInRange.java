package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearIntegerSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 324, 5435 , 6456, 746, 45, 4746};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = in.nextInt();
        System.out.println("Enter the starting index: ");
        int start = in.nextInt();
        System.out.println("Enter the ending index: ");
        int end = in.nextInt();
        linear(arr, target, start, end);

    }
    static void linear(int[] arr, int target, int start, int end){
        for(int row = start; row <= end; row++) {
            if (target == arr[row]) {
                System.out.println("item found at index: " + row);
                return;
            }
        }
        System.out.println("item not found!!!");

    }
}
