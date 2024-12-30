package inheritance;

// This is the interface
interface Animal3 {
    void sound(); // All animals should make a sound

    void eat(); // All animals should eat
}
// inheritance.Dog3 class implements inheritance.Animal3 interface
class Dog3 implements Animal3 {
    @Override
    public void sound() {
        System.out.println("inheritance.Dog3 barks");
    }

    @Override
    public void eat() {
        System.out.println("inheritance.Dog3 eats");
    }
}

// inheritance.cat3 class implements inheritance.Animal3 interface
class cat3 implements Animal3 {
    @Override
    public void sound() {
        System.out.println("inheritance.cat3 meows");
    }

    @Override
    public void eat() {
        System.out.println("inheritance.cat3 eats");
    }
}

class Puppy1 extends Dog3 {
    @Override
    public void sound() {
        System.out.println("puppy barks");
    }

    @Override
    public void eat() {
        System.out.println("puppy eats");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog3 myDog3 = new Dog3();
        Animal3 mycat3 = new cat3();
        Dog3 mypuppy = new Puppy1();
        myDog3.sound(); // Output: inheritance.Dog3 barks
        myDog3.eat(); // Output: inheritance.Dog3 eats

        mycat3.sound(); // Output: inheritance.cat3 meows
        mycat3.eat(); // Output: inheritance.cat3 eats

        mypuppy.sound();
        mypuppy.eat();
    }
}
