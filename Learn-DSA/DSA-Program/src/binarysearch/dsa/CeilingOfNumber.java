package binarysearch.dsa;

public class CeilingOfNumber {  //ceiling = Smallest element in the array which is >= target
    public static void main(String[] args){
        int[] arr = {12, 13, 18, 34, 35, 38, 70};
        int target = 36;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {   // it will stop when start > end
        int middle = start + (end - start) / 2;   // 4 + ( 4-4)/ 2  = 0 / 2 = 0 + 4 = 4
            if (target == arr[middle]) {
                return middle;
            }
            else if (target < arr[middle]){
                end = middle - 1;   // at last iteration start and end  become 4 and 4
            }
            else {
                start = middle + 1;
            }
        }
        return arr[start];  // always choose start because it will choose the greater

        // at last both end and middle will be at same index which is less than start.
    }
}
