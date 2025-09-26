package programs;

import java.util.HashMap;

public class frequency 
{
public static void main(String [] args )
{
	String ak="Akshay";
	HashMap<Character,Integer> aks= new HashMap<>();
	
	for(char c: ak.toCharArray()) {
		aks.put(c, aks.getOrDefault(c, 0) + 1);
	
}
	System.out.println(aks);
}
}


