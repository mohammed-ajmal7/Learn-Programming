package polymorphism;

class Student6 {   // method Overloading
        String name;
        int age;

        public void studInfo(String name){
            System.out.println(this.name);
        }
        public void studInfo(int age){
        System.out.println(this.age);
        }
        public void studInfo(String name, int age){
        System.out.println(this.name + " " + this.age);
        }
}



public class PolyMethodOverloading {   //compile time polymorphism
    public static void main(String[] args) {

        Student6 st6 = new Student6();
        st6.name = "ajmal";
        st6.age = 21;


        st6.studInfo(st6.name, st6.age);

    }

}
