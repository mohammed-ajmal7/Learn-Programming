public class pro8 {

    static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of 1st and 2nd values is : " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Method started");
        addition(25, 100);
        addition(50, 150);
        addition(75, 200);
        addition(100, 250);
        System.out.println("Method Ended");
    }
}
