package binarysearch.dsa;


//the largest number <= to the target
public class SamplePro2Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;            // this was an question where we want which is the <= 6 but in other ceiling we cheked >= 6
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (start > end){
            return -1;
        }

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (target < arr[middle]){
                end = middle - 1;

            }else if (target > arr[middle]){
                start = middle + 1;
            }
            else {
                return arr[middle];
            }
        }
        return arr[end];
    }
}
