package in.tnsif.constructoroverloading;

public class ConstructorOverloadingExample {
	
	private int x;
	private int y;
	
	public ConstructorOverloadingExample()
	{
		System.out.println("Default Constructor");
	}
	public ConstructorOverloadingExample(int x)
	{
		System.out.println(" Constructor"+ x);
	}
	public ConstructorOverloadingExample(int x, int y)
	{
		System.out.println("Constructor"+x+y);
	}

}
