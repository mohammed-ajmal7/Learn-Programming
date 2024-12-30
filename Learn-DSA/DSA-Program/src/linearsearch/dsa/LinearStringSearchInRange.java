package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearStringSearchInRange {
    public static void main(String[] args) {
        String name = "MohammedAjmal";
        System.out.println(Arrays.toString(name.toCharArray()));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target letter: ");
        char target = in.next().charAt(0);
        System.out.println("Enter the starting index: ");
        int start = in.nextInt();
        System.out.println("Enter the ending index: ");
        int end = in.nextInt();
        int result = linear(name, target, start, end);
        if (result != -1) {
            System.out.println("item found at index: " + result);
        } else {
            System.out.println("item not found!!!");
        }
    }
    static int linear(String name, char target, int start, int end){
        for(int row = start; row < end; row++){
            if( target == name.charAt(row)){
                return row;
            }
        }
        return -1;
    }
}
