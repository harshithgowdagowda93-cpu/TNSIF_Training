package org.tnsif.acc.c2tc.interview_quections.basic;

public class CharacterFrequency2 {

	public static void main(String[] args) {
		
		        String str = "Java Programming";

		        // Convert the string to lowercase
		        str = str.toLowerCase();

		        char[] ch = str.toCharArray();
		        boolean[] visited = new boolean[ch.length];

		        System.out.println("Character Frequencies:");

		        for (int i = 0; i < ch.length; i++) {

		            // Ignore spaces and already counted characters
		            if (ch[i] == ' ' || visited[i]) {
		                continue;
		            }

		            int count = 1;

		            for (int j = i + 1; j < ch.length; j++) {
		                if (ch[i] == ch[j]) {
		                    count++;
		                    visited[j] = true;
		                }
		            }

		            System.out.println(ch[i] + " : " + count);
		        }
		    }
		}