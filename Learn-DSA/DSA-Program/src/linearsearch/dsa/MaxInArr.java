package linearsearch.dsa;


import java.util.Arrays;

public class MaxInArr {
    public static void main(String[] args) {
        int[] arr =  {300, 500, 700, 900, 400};
        System.out.println("Array\n"+ Arrays.toString(arr));
        System.out.println("The Max value of the Array: " +findMax(arr));
    }

    static int findMax(int[] arr){
        int maxValue = arr[0];
        for (int row = 1; row < arr.length; row++) {
            if (maxValue < arr[row]){
                maxValue = arr[row];
            }
        }
        return maxValue;
    }
}
