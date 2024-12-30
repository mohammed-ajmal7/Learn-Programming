package Constructor;

class Student4{
    String name;
    int age;
    public void info4(){
        System.out.println(this.name + "\n" + this.age);
    }

    Student4(Student4 st5){
        this.name = st5.name;
        this.age = st5.age;
    }
    Student4(){

    }

}








public class CopyConstructor {
    public static void main(String[] args) {
        Student4 st4 = new Student4();
        st4.name = "ajmal";
        st4.age = 21;
        Student4 st5 = new Student4(st4);
        st5.info4();
    }
}
