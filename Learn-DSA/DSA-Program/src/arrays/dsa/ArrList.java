package arrays.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {

        //dynamic Arrays
        ArrayList<Integer> List = new ArrayList<>(3);
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);

        System.out.println(List);

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List2 = new ArrayList<>(3);

        for (int i = 0; i < 5; i++) {
            List2.add(in.nextInt());
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(List2.get(j));
        }
        //or

        System.out.println(List2);
    }
}
