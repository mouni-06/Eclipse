package ConstructorOverloading;

public class InvokingConstructor {
	
	
	public InvokingConstructor()
	{
		System.out.println("default constructor");	
		
	}		
	public InvokingConstructor(int x, int y)
	{
	
		System.out.println("two args");
	}	
	public InvokingConstructor(int x, int y, int z)
	{
		
		this(1,2);
		System.out.println("three args");
	}	

}
