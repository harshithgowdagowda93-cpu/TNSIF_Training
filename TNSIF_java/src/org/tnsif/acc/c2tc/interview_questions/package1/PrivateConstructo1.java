package org.tnsif.acc.c2tc.interview_questions.package1;

public class PrivateConstructor1 {

    private PrivateConstructor1() {
        System.out.println("Private constructor called");
    }

    public static PrivateConstructor1 createObject() {
        return new PrivateConstructor1();
    }

    public void display() {
        System.out.println("Object created successfully");
    }

    public static void main(String[] args) {

        // PrivateConstructor obj = new PrivateConstructor();
        // Cannot create object directly because constructor is private.

        PrivateConstructor1 obj = PrivateConstructor1.createObject();

        obj.display();
    }
}