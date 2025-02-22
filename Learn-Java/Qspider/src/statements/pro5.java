class pro5 {
    public static void main(String[] args) {
        double a = 90;

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("gulab jamun");
        } else if (a % 2 == 0) {
            System.out.println("rasagula");
        } else if (a % 3 == 0) {
            System.out.println("porotta");
        } else {
            System.out.println("boooli");
        }
    }
}