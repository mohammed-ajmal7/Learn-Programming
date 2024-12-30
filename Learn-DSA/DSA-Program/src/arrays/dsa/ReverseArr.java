package arrays.dsa;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 400, 796, 786, 376, 4};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end ){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int str_index, int end_index){
        int temp = arr[str_index];
        arr[str_index] = arr[end_index];
        arr[end_index] = temp;

    }

}


