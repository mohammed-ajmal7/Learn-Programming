package arrays.dsa;

import java.util.Arrays;

public class TwoSum {  // add 2 num from arr and get target as result.
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr, target)));
    }

    static int[] sum(int[] arr, int target){
        for(int row = 0; row < arr.length; row ++){
            for(int i = row + 1; i < arr.length; i++) {  //its an inner loop,  it only looks at the next elements, avoiding repeated pairs.
                if (arr[row] + arr[i] == target){
                    return new int[]{row, i};
                }
            }
        }
        return new int[0];
    }

}
