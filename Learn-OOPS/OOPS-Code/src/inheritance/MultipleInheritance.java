package inheritance;
// First interface
interface Animal4{
    void sound();  // abstract method
}

// Second interface
interface Mammal {
    void walk();   // abstract method
}

// A class implementing both interfaces
class Dog4 implements Animal4, Mammal {
    // Implementing the sound() method from the Animal interface
    public void sound() {
        System.out.println("Dog barks");
    }

    // Implementing the walk() method from the Mammal interface
    public void walk() {
        System.out.println("Dog walks");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.sound(); // Output: Dog barks
        dog.walk();  // Output: Dog walks
    }
}
