package org.TNSIF.acc.c2tc.java;

public class Variable {
    int price = 10; // corrected variable name

    void print() {
        String msg = "hello"; // corrected spacing
        System.out.println(msg);
    }

    static String message = "Hello Students"; // corrected 'Static'

    public static void main(String[] args) {
        Variable object = new Variable(); // corrected class name
        System.out.println(object.price); // corrected object reference
        object.print();
        System.out.println(message); // corrected 'System'
    }
}
