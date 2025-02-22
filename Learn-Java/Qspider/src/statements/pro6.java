class pro6 {
    public static void main(String[] args) {
        int age = 2;

        if (age <= 3) {
            System.out.println("FREE!!!!!!!!!!");
        } else if (age > 3 && age <= 10) {
            System.out.println("HALF TICKET");
        } else if (age > 10 && age <= 60) {
            System.out.println("GENERAL TICKET");
        } else {
            System.out.println("SENIOR TICKET");
        }
    }
}