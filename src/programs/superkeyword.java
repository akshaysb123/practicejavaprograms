package programs;

class parent{
	void show()
	{
		System.out.println("parent class implementation");
	}
}

class child extends parent
{
	void show()
	{
		System.out.println("child class implementaion");
		super.show();
	}
}
	
public class superkeyword {

	 public static void main(String[] args) {
	       child c = new child();
	       c.show();

	}

}
