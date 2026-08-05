package org.tnsif.acc.c2tc.interview_quections.basic;
class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make the constructor private
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Step 3: Provide a public method to access the object
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hello from Singleton Class");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        // Both references point to the same object
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different.");
        }
    }
}

	