package binarysearch.dsa;

public class OrderAgnosticBS {            // we can check both ascending and decending
    public static void main(String[] args) {
        int[] arr = {12, 13, 18, 34, 35, 38, 49, 57, 59, 60, 68, 78, 79, 80, 94, 96, 100, 111, 1567, 2000};
//        int[] arr = {2000, 1567, 111, 100, 96, 94, 80 , 79, 78, 68, 60, 59, 57, 49, 38, 35, 34, 18, 13, 12};
        int target = 68;
        int result = bsearch(arr, target);
        System.out.println(result);
    }
    static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;  // this both are indexes

        boolean asc = arr[start] < arr[end];  // here it is indexes the above one

        while (start <= end){
            int middle = start + (end - start) / 2;

            if ( arr[middle] == target){
                return middle;
            }
            if (asc){
                if (target < arr[middle]){   // here chcking values
                    end = middle - 1;
                }
                else if (target > arr[middle]){
                        start = middle + 1;
                    }
                }
            else {
                if ( target < arr[middle]){
                    start = middle + 1;
                }
                else if (target > arr[middle]){
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
