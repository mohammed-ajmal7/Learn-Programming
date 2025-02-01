package linearsearch.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LinearStringSearch2DArr {
    public static void main(String[] args) {
        String[][] fruits = {
                {"apple", "banana", "cherry"},
                {"date", "fig", "grape", "coconut"},
                {"kiwi", "lemon", "mango"}
        };
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.deepToString(fruits));
        System.out.println("Enter an Fruit Name: ");
        String target = in.next();
        linear(fruits, target);
    }

    static void linear(String [][] fruits, String target){
        for (int row = 0; row < fruits.length; row++) {
            for (int col = 0; col < fruits[row].length; col++) {
                if(target.equals(fruits[row][col])){
                    System.out.println("THe Fruit Name Found At Index of: " + Arrays.toString(new int[]{row, col}));
                    return;
                }
            }
        }
        System.out.println("Invalid Input");
    }
}
