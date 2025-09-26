package programs;

import java.util.HashMap;

public class swap {


    public static void main(String[] args) {
        String input = "AKSHAYAKSHAY";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            //map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}



