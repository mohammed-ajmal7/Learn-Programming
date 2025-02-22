public class pro7 {

    static void test(boolean b) {
        System.out.println("The value is : " + b);
    }

    static void disp(char c) {
        System.out.println("The value is : " + c);
    }

    public static void main(String[] args) {
        System.out.println("Method started");
        test(true);
        disp('S');
        System.out.println("Method Ended");
    }
}
