package arrays.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        //Initialization

        for (int i = 0; i < 3; i++) {
            List.add(new ArrayList<>());
        }

        //add ele

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                List.get(i).add(in.nextInt()); /// get i means take first row
            }

        }
            System.out.print(List);

     }
}
