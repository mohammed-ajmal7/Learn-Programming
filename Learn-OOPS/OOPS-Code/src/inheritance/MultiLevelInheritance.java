package inheritance;

// Base class (grandparent class)
class Animal1 {
    String name;

    // Constructor
    Animal1(String name) {
        this.name = name;
    }

    // Method in the base class
    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Intermediate class (parent class) inheriting from inheritance.Animal1
class Dog extends Animal1 {

    // Constructor for inheritance.Dog
    Dog(String name) {
        super(name);  // Call the constructor of the inheritance.Animal1 class
    }

    // Overriding the speak method
    @Override
    void speak() {
        System.out.println(name + " barks.");
    }
}

// Derived class (child class) inheriting from inheritance.Dog
class Puppy extends Dog {

    // Constructor for inheritance.Puppy
    Puppy(String name) {
        super(name);  // Call the constructor of the inheritance.Dog class
    }

    // Overriding the speak method
    @Override
    void speak() {
        System.out.println(name + " yelps.");
    }
}

// Main class to test multilevel inheritance
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of the inheritance.Puppy class
        Puppy puppy = new Puppy("Charlie");
        puppy.speak();  // Output: Charlie yelps.
    }
}
