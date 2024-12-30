package Constructor;

class Student2{
    String name;
    int age;
    public void info2(){
        System.out.println(this.name + "  " + this.age);
    }

    Student2(){
        name = "ajmal";
        age = 21;

    }
}


public class NonParaConstructor {
    public static void main(String[] args) {
        Student2 stt = new Student2();
        stt.info2();
    }
}
