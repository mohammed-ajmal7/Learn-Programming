class pro7 {
    public static void main(String[] args) {
        float cgpa = 4.1f;

        if (cgpa >= 5.0 && cgpa <= 6.0) {
            System.out.println("AVERAGE");
        } else if (cgpa > 6.0 && cgpa < 9.0) {
            System.out.println("ABOVE AVERAGE");
        } else if (cgpa > 9.0 && cgpa <= 10.0) {
            System.out.println("DISTINCTION");
        } else {
            System.out.println("FAIL!!!!!!");
        }
    }
}