package arrays.dsa;
import java.util.Arrays;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 400, 600, 40000};
        System.out.println(Arrays.toString(arr));
        System.out.println(Max(arr));
        System.out.println(MaxRange(arr, 0, 2));

    }
// finding max in the entire Array
    static int Max(int[] arr){
        int MaxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > MaxValue){
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
// finding max from one end to other
    static int MaxRange(int[] arr, int start_ind, int end_ind){
        int MaxValue = start_ind;
        for (int i = start_ind; i <= end_ind; i++){
            if(arr[i] > MaxValue){
                MaxValue = arr[i];
            }
        }
        return MaxValue;

    }
}
