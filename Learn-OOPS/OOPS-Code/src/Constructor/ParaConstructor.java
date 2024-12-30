package Constructor;

class Student3{
    String name;
    int age;
    public void info3(){
        System.out.println(this.name + "  " + this.age);
    }

    Student3(String name, int age){
        this.name = name;
        this.age = age;
    }
}






public class ParaConstructor {
    public static void main(String[] args) {
        Student3 st3 = new Student3("ajmal", 21);
        st3.info3();
    }
}
