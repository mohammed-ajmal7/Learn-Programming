class pro4 {
    static void test() {
        System.out.println("test() start...............");
        System.out.println("test() end...............");
    }

    static void disp() {
        System.out.println("disp() start...............");
        test();
        System.out.println("desp() end...............");

    }

    public static void main(String[] args) {
        System.out.println("main method started...............");
        disp();
        System.out.println("main method ended...............");

    }
}