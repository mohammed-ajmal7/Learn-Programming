package arrays.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class LearnArrays {
    public static void main(String[] args) {
        //strore 5 roll no
        Scanner in = new Scanner(System.in);
        int[] rollno = new int[10];
        //or
//    int[] rollnum = {23, 45, 67, 56, 43};
//
//        rollno[0] = 232;
//        rollno[1] = 233;
//        rollno[2] = 234;
//        rollno[3] = 235;
//        rollno[4] = 236;
//
//        System.out.println(rollno[1]);

// 1st you have to do like this then only you can use -> enhanced methods
        for (int i = 0; i < rollno.length; i++) {
            rollno[i] = in.nextInt();
        }
//
//        for (int i = 0; i < rollno.length; i++) {
//            System.out.println(rollno[i]);
//        }
//
         // easy way to print

        System.out.println(Arrays.toString(rollno));


        // enhanced method
        for (int num : rollno){  // for element in the array roll no, print the element
            System.out.print(num + " "); // num represent each element of the array
        }

    }


}


