package programs;

import java.util.HashMap;
import java.util.HashSet;

public class duplicateinstring {

	 public static void main(String[] args) {
	        String input = "programming";
	        HashSet<Character> seen = new HashSet<>();

	        for (char c : input.toCharArray()) {
	            if (!seen.add(c)) {
	                System.out.println("Duplicate: " + c);
	            }
	        }
	    }
	}
