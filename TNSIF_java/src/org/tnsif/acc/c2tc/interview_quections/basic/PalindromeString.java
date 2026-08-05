package org.tnsif.acc.c2tc.interview_quections.basic;

public class PalindromeString {

	public static void main(String[] args) {
		 String str = "madam";
	        String reverse = "";

	        // Reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reverse += str.charAt(i);
	        }

	        // Check if original and reversed strings are equal
	        if (str.equals(reverse)) {
	            System.out.println(str + " is a Palindrome.");
	        } else {
	            System.out.println(str + " is Not a Palindrome.");
	        }
	    }
	}