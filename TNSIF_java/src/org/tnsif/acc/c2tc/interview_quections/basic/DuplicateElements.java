package org.tnsif.acc.c2tc.interview_quections.basic;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 5, 1};

        System.out.println("Duplicate elements are:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }
}