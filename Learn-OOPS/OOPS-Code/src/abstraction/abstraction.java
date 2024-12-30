package abstraction;

abstract class Animal{
    Animal(){ //this is called constructor chaining
        System.out.println("Animal constructor created");
    }
    abstract void walk();
    public void eat(){ // it is not an abstract so it not an interface abstractio
        System.out.println("Animal Eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor created");
    }
    public void walk(){
        System.out.println("horse walks in 4 legs");
    }

}

class Chicken extends Animal{
    public void walk(){
        System.out.println("chiken walk in 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
//        Animal an1 = new Animal(); // it cannot be instantive
//        an1.walk();
//        an1.eat();
        Horse an2 = new Horse();
        an2.walk();
        an2.eat();
        Chicken an3 = new Chicken();
        an3.walk();
        an3.eat();
    }

}
