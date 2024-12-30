package polymorphism;

class Student7{
    public void eat(){
        System.out.println("student eating ");
    }
}

class Man extends Student7{
    public void eat() {
        System.out.println("polymorphism.Man eating");
    }
}

class Woman extends Man{
    public void eat(){
        System.out.println("polymorphism.Woman eating");
    }
}




public class PolyMethodOverriding {  //runtime polymorphism
    public static void main(String[] args) {
        Student7 st7 = new Student7();
        Student7 st8 = new Man();
        Man st9 = new Woman();

        st7.eat();
        st8.eat();
        st9.eat();
    }

}
