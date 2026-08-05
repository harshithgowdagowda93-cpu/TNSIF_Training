package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name=scan.nextLine();
	
	System.out.println("Enter your age");
	int age=scan.nextInt();
	
	
	System.out.println("Enter your Highr");
	float hight=scan.nextFloat();
	
	System.out.println("Are you a Student");
	boolean is_Student=scan.nextBoolean();
	
	System.out.println("Enter your favorit Teacher name");
	String teacher=scan.nextLine();
	
	System.out.println("Enter your Hobby");
	String hobby=scan.nextLine();
	
	System.out.println("Enter your daily reading time in minute");
	byte readingtime=scan.nextByte();
	
	System.out.println(" ")
	
	
	

	}

}
