package abstraction;

interface Animal1{

    // All the things inside interface is public, static, final by default
    int eyes = 2;
    void walk();
    void eat();

}

class Horse1 implements Animal1{
    public void eyes(){
        System.out.println(eyes);
    }

    public void walk(){
        System.out.println("Horse walk in 4 legs");
    }

    public void eat(){
        System.out.println("Horse eat grass");
    }

}
public class InterfacAbstraction {
    public static void main(String[] args) {
//        Animal an = new Animal();
//        Animal an1 = new Horse();
        Horse1 an1 = new Horse1();
        an1.walk();
        an1.eyes();
        an1.eat();
    }
}
