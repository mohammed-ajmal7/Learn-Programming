package binarysearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 13, 18, 34, 35, 38, 49, 57, 59, 60, 68, 78, 79, 80, 94, 96, 100, 111, 1567, 2000};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int result = bSearch(arr, target);
        System.out.println(result);
    }

    static int bSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
            while (start <= end) {
                int middle = start + (end - start) / 2;  // non-efficient mehtod is (start + end) / 2
                          // 100   +   200 - 100  / 2                                100 +   200
                                        // 100 / 2 = 50 + 100 = 150
                if (target < arr[middle]){
                    end = middle - 1;
                } else if (target > arr[middle]) { // arr[middle] means value
                    start = middle + 1; // just middle means index
                }else {
                    return middle;
                }
            }
        return -1;
    }
}
