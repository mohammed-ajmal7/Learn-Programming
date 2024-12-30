package acessspecifiers;

public class Protected {
}

//
//// File: ProtectedExample.java

//package com.example;
//
//public class ProtectedExample {
//    protected String familySecret = "Protected Secret";  // protected field
//
//    protected void showFamilySecret() {  // protected method
//        System.out.println("This is a protected method.");
//    }
//}
//
//// In another file in the same package:
//package com.example;
//
//public class TestProtectedSamePackage {
//    public static void main(String[] args) {
//        ProtectedExample obj = new ProtectedExample();
//        System.out.println(obj.familySecret);  // Accessing protected member in the same package
//        obj.showFamilySecret();  // Output: This is a protected method.
//    }
//}
//
//// In a subclass in a different package:
//package com.test;
//
//import com.example.ProtectedExample;
////
//public class TestProtectedDifferentPackage extends ProtectedExample {
//    public static void main(String[] args) {
//        TestProtectedDifferentPackage obj = new TestProtectedDifferentPackage();
//        System.out.println(obj.familySecret);  // Accessing protected member via subclass
//        obj.showFamilySecret();  // Output: This is a protected method.
//    }
//}
