class pro4 {
    public static void main(String[] args) {

        int num = 15;
        int a = 1;

        while (a <= num / 2) {

            if (num % a == 0) {
                System.out.println(a + " is a divisor of " + num);
            }
            a++;
        }
    }
}
