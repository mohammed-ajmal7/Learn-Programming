class pro10 {
    public static void main(String[] args) {

        String gender = "shemale";

        int age = 21;

        if (gender == "male") {
            if (age > 22) {
                System.out.println("Ready for Searching bride");
            } else {
                System.out.println("you are under age come after some year");
            }
        } else if (gender == "female") {
            if (age > 21) {
                System.out.println("you are ready for searching groom");
            } else {
                System.out.println("you are under age come after some year");
            }
        } else {
            System.out.println("no shemale and gays are allowed !!!");
        }
    }
}