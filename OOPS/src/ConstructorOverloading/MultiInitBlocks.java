package ConstructorOverloading;

public class MultiInitBlocks {
	{
		System.out.println ("Initialize block1");
	}

	public MultiInitBlocks()
	{
		System.out.println ("constructor");
	}
	
	{
		System.out.println ("Initialize block2");
	}
	
	public void display()
	{
		System.out.println ("I am in display");
	}
	
	{
		System.out.println ("Initialize block3");
	}

}
