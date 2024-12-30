package arrays.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        int[][] Tarr = new int[3][3];
//        System.out.println(Tarr.length);
//
//        for (int row = 0; row < Tarr.length; row ++){
//            for (int col = 0; col < Tarr[row].length; col ++){
//                Tarr[row][col] = in.nextInt();
//            }
//        }

//        for(int row = 0; row < Tarr.length; row ++){
//            for (int col = 0; col < Tarr[row].length; col ++){
//                System.out.print(Tarr[row][col] + " ");
//            }
//            System.out.println();
//        }

//
//        for (int row = 0; row < Tarr.length; row ++){
//            System.out.println(Arrays.toString(Tarr[row]));
//        }

        int[][] Rarray = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < Rarray.length; row ++){   // .lenght actually checking the elements in the array
            for (int col = 0; col < Rarray[row].length; col ++){ // when length check ele in the array col will start at 0 when ele = 4, col = 3{0, 1, 2, 3}
                System.out.print(Rarray[row][col] + " ");
            }
            System.out.println();
        }

    }
}