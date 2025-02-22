class pro9 {
    public static void main(String[] args) {

        double acc_balance = 500000.0;
        int amount = 1000;

        if (amount < acc_balance) {
            if (amount % 100 == 0) {
                System.out.println("Withdrawal Sucessfull  " + amount);
            } else {
                System.out.println("enter the values of 100 multiples");
            }
        } else {
            System.out.println("Insufficient Amount");
        }
    }
}