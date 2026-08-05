package org.tnsif.acc.c2tc.scannerclass_bufferreader;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        System.out.println("Enter your height:");
        float height = scan.nextFloat();

        System.out.println("Are you a student (true/false)?");
        boolean isStudent = scan.nextBoolean();

        scan.nextLine(); // Clears the leftover newline

        System.out.println("Enter your favorite teacher name:");
        String teacher = scan.nextLine();

        System.out.println("Enter your hobby:");
        String hobby = scan.nextLine();

        System.out.println("Enter your daily reading time in minutes:");
        byte readingTime = scan.nextByte();

        // Display Details
        System.out.println("\n----- Student Details -----");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Height        : " + height);
        System.out.println("Student       : " + isStudent);
        System.out.println("Teacher       : " + teacher);
        System.out.println("Hobby         : " + hobby);
        System.out.println("Reading Time  : " + readingTime + " minutes");

        scan.close();
    }
}