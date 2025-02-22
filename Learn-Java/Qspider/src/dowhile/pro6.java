class pro6 {
    public static void main(String[] args) {

        int num = 20;
        int a = 1;
        int sum = 0; // we have to add the divisor and get it sum

        while (a <= num / 2) {
            if (num % a == 0) {
                sum = sum + a;
                System.out.println("current sum " + sum);
            }
            a++;
        }
        System.out.println(sum);

        if (sum == num) {
            System.out.println("its a perfect number");

        } else {
            System.out.println("its not a perfect number");
        }
    }
}