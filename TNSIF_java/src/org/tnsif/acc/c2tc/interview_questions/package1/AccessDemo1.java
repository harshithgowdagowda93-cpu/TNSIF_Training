package org.tnsif.acc.c2tc.interview_questions.package1;

public class AccessDemo1 {

    private void display() {
        System.out.println("This method is private");
    }

    public void show() {
        display();
    }

    public static void main(String[] args) {

        AccessDemo1 obj = new AccessDemo1();

        // obj.display(); // Error: private method cannot be accessed directly

        obj.show();
    }
}