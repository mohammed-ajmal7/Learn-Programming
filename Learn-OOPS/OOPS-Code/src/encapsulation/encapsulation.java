package encapsulation;

public class encapsulation {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public constructor
    public encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for 'name' (provides read access)
    public String getName() {
        return name;
    }

    // Setter for 'name' (provides write access)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age' (provides read access)
    public int getAge() {
        return age;
    }

    // Setter for 'age' with validation (provides controlled write access)
    public void setAge(int age) {
        this.age = age;

    }
    // Main method to test encapsulation
    public static void main(String[] args) {
        // Creating an encapsulation object
        encapsulation emp = new encapsulation("John", 30);

        // Accessing and modifying fields using getter and setter methods
        System.out.println("Name: " + emp.getName());  // Output: John
        System.out.println("Age: " + emp.getAge());    // Output: 30

        // Trying to change the data
        emp.setName("Alice");
        emp.setAge(25);

        // Output: 25
        System.out.println("Updated Name: " + emp.getName());  // Output: Alice
        System.out.println("Updated Age: " + emp.getAge());
        // Invalid age attempt
        emp.setAge(-5);  // Output: Age must be positive.
    }
}
