package MaxWealth;
import javax.swing.*;
import java.util.Arrays;


public class MaxWealthArr {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(wealthcheck(accounts));


    }
    static int wealthcheck(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
        int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
//        System.out.println(sum);
        if (sum > ans){
            ans = sum;
        }
        }
        return ans;
    }
}
