package org.tnsif.acc.c2tc.tnsif.interfaceDemo;

interface Vehicle {

    void start();
    void stop();

    default void repair() {
        System.out.println("General vehicle repair service");
    }
}

class Car implements Vehicle {

    private String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " stopping");
    }

    @Override
    public void repair() {
        System.out.println("Car " + model + " specific service");
    }
}

class Bike implements Vehicle {

    private String type;

    Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + type + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " stopping");
    }

    @Override
    public void repair() {
        System.out.println("Bike " + type + " specific service");
    }
}

public class Default_Static_Demo1 {

    public static void main(String[] args) {

        Vehicle car = new Car("KIA");
        Vehicle bike = new Bike("RX 100");

        car.start();
        car.stop();
        car.repair();

        bike.start();
        bike.stop();
        bike.repair();
    }
}