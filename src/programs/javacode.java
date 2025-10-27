package programs;

public class javacode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="My name is Akshay";
		String b="";
		String c=a.replaceAll("\\s+", "");
		for (int i = c.length() - 1; i >= 0; i--) {
		    
		    System.out.print(c.charAt(i));
		
		
		System.out.println(c);
		
		}

	}

}
