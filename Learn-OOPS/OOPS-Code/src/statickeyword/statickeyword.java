package statickeyword;

class student5 {
    String name;
    static String school;

    public static void schoolChange() {
        school = "new School";
    }
}

public class statickeyword {
    public static void main(String[] args) {
        student5.school = "crescent";  // setting static variable directly through the class
        student5 st5 = new student5(); // creating an instance of student5
        st5.name = "ajmal";

        // Calling the static method correctly
        student5.schoolChange();  // Use class name to call static method

        // Display results
        System.out.println(student5.school); // static field, accessed through the class
        System.out.println(st5.name);        // non-static field, accessed through object
    }
}
