package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String");
	char c=scan.next().charAt(1);
	System.out.println("The second char in a string is:"+c);
	String word=scan.nextLine();
	System.out.println("The String is:"+word);
	scan.close();

	}

}
