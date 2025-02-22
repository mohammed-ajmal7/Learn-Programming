class pro8 {
    public static void main(String[] args) {

        int num = 20;
        int a = 1;
        int sum = 0; // we have to add the divisor and get it sum
        int count = 0;

        while (a <= num / 2) {
            if (num % a == 0) {
                System.out.println(a);
                count++; // when printdivisor just increment count at last print it
            }
            a++;
        }
        System.out.println("number of devisor " + count);

        System.out.println(count == 1 ? "Prime number" : "Not Prime Number");
        // if count == 1 ? then this : not then this
    }
}