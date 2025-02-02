package binarysearch.dsa;


// the smallest number which is >   = target
public class SamplePro1Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 16};   // at last end and start will be 7[3]
        int target = 8;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (target == arr[middle]){
                return middle;

            } else if (target > arr[middle]) {
                start = middle + 1;

            }else {
                end = middle - 1;
            }
        }
        return arr[start];
    }
}
