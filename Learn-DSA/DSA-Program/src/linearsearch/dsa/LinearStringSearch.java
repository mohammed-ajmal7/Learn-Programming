package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearStringSearch {
    public static void main(String[] args) {
        String name = "Ajmal";
        System.out.println(Arrays.toString(name.toCharArray()));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target letter: ");
        char target = in.next().charAt(0);
        int result = linear(name, target);
        if (result != -1) {
            System.out.println("item found at index: " + result);
        } else {
            System.out.println("item not found!!!");
        }
    }

    static int linear(String name, char target) {
        for (int row = 0; row < name.length(); row++) {
            if (target == name.charAt(row)) {
                return row;
            }
        }
        return -1;
    }
}


