package programs;

public class reversestring {

	public static void main(String[] args) {
	
		        String input = "AK";
		        String revers = new StringBuilder(input).reverse().toString();
		        System.out.println("Revers: " + revers);
		    
	if(input.equals(revers))
	{
		 System.out.println("pallindrome");
	}
	else {
		System.out.println("not pallindrome");
	}

}
}