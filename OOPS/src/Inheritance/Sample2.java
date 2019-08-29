package Inheritance;

public class Sample2 extends Sample1 {
	private int c;
	private int d;
	
	public void SetData(int x,int y,int z,int i)
	{
		super.a=x;
		super.b=y;
		c=z;
		d=i;
		
	}
	public void display()
	{
		System.out.println("a= "+a+"\t b="+b+"\tc="+c+"\td= "+d);
	}
		
	
    

}
