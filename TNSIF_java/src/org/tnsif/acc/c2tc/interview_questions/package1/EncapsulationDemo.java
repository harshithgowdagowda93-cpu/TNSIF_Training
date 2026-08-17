package org.tnsif.acc.c2tc.interview_questions.package1;

public class EncapsulationDemo {

    // Private variables - data hiding
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setName("Harshith");
        obj.setAge(21);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}