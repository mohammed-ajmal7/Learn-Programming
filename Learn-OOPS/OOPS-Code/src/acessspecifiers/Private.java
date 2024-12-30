package acessspecifiers;

public class Private {
}
//
//// File: PrivateExample.java
//package com.example;
//
//public class PrivateExample {
//    private String secret = "Private Secret";  // private field
//
//    private void displaySecret() {  // private method
//        System.out.println("This is a private method: " + secret);
//    }
//
//    public void publicMethod() {
//        displaySecret();  // Can access private method inside the class
//    }
//}
//
//// In another file:
//package com.test;
//
//import com.example.PrivateExample;
//
//public class TestPrivate {
//    public static void main(String[] args) {
//        PrivateExample obj = new PrivateExample();
//        // System.out.println(obj.secret); // Error: 'secret' has private access in 'PrivateExample'
//        // obj.displaySecret(); // Error: 'displaySecret()' has private access
//        obj.publicMethod();  // Indirect access to private method via public method
//    }
//}
//
