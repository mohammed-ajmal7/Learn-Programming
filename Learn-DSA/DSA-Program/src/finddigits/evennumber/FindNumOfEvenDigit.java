package finddigits.evennumber;

public class FindNumOfEvenDigit {
    public static void main(String[] args){
    int[] nums = {555,901,482,1771,564545,68779769, 0, -324392};
    int numCount = 0;
    for (int no : nums){
        int digit = countDigit(no);
        if(digit % 2 == 0){
            numCount++;
        }
    }
        System.out.println(numCount);
    }
    static int countDigit(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int digitcount = 0;
        while (num > 0){
            num = num / 10;
            digitcount++;
        }
        return digitcount;
    }
}
