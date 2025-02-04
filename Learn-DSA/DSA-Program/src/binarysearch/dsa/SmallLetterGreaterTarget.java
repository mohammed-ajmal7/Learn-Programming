package binarysearch.dsa;

public class SmallLetterGreaterTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
//        char target = 'd';
        System.out.println(findGreaterLetter(arr, target));
    }

    static char findGreaterLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;  // 0 + (0 - 0) / 2 = 0 = start & middle & end

            // need both >= because we need smallest char greater than target
            if (target >= arr[middle]){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return arr[start % arr.length];  // arr[4 % 4] = arr[0]
                                        // arr [ 3 % 4] = arr[3]
    }
}
