package inheritance;

// Parent class
class Animal2 {
    String name;

    // Constructor
    Animal2(String name) {
        this.name = name;
    }

    // Method in the parent class
    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class 1 inheriting from inheritance.Animal2
class Dog2 extends Animal2 {

    // Constructor for inheritance.Dog2
    Dog2(String name) {
        super(name);  // Call the constructor of the inheritance.Animal2 class
    }

    // Overriding the speak method
    @Override
    void speak() {
        System.out.println(name + " barks.");
    }
}

// Child class 2 inheriting from inheritance.Animal2
class Cat extends Animal2 {

    // Constructor for inheritance.Cat
    Cat(String name) {
        super(name);  // Call the constructor of the inheritance.Animal2 class
    }

    // Overriding the speak method
    @Override
    void speak() {
        System.out.println(name + " meows.");
    }
}

// Main class to test hierarchical inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating instances of inheritance.Dog2 and inheritance.Cat classes
        Dog2 Dog2 = new Dog2("Buddy");
        Cat cat = new Cat("Whiskers");

        // Calling the speak method on both instances
        Dog2.speak();  // Output: Buddy barks.
        cat.speak();  // Output: Whiskers meows.
    }
}
