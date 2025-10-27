package programs;

public class methodoverloadingexample {
	
	
	public int add(int a,int b) {
		return a+b;
		
	}
    public int add(int a,int b,int c) {
    	return a+b+c;
    }
	public static void main(String[] args) {
		methodoverloadingexample c= new methodoverloadingexample();
		System.out.println(c.add(10, 20,30));
		System.out.println(c.add(40, 50));
		

	}

}
