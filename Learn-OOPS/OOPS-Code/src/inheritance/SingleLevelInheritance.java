package inheritance;

// Parent class
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method in the parent class
    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class inheriting from inheritance.Animal (single-level inheritance)
class Dog1 extends Animal {

    // Constructor for inheritance.Dog1
    Dog1(String name) {
        super(name);  // Call the constructor of the parent class
    }

    // Overriding the speak method
    @Override
    void speak() {
        System.out.println(name + " barks.");
    }
}

// Main class to test single-level inheritance
public class SingleLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of the inheritance.Dog1 class
        Dog1 Dog1 = new Dog1("Buddy");
        Dog1.speak();  // Output: Buddy barks.
    }
}
