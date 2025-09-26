package programs;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class frequencyandmaxcount {
	 public static void getCharCountAndMax(String str) {
	       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	       int count = 0;
	       char ans = ' ';
	       // Counting frequency of each character
	       for (int i = 0; i < str.length(); i++) {
	           char ch = str.charAt(i);
	           if (!String.valueOf(ch).isBlank()) {
	               map.put(ch, map.getOrDefault(ch, 0) + 1);
	               // Updating max character using same logic from your image
	               if (count < map.get(ch)) {
	                   ans = ch;
	                   count = map.get(ch);
	               }
	           }
	       }
	       System.out.println("Character frequencies: " + map);
	       System.out.println("Maximum occurring character: '" + ans + "' occurred " + count + " times.");
	   }
	   public static void main(String[] args) {
	      
	       getCharCountAndMax("input");
	       //sc.close();
	   }
	}
