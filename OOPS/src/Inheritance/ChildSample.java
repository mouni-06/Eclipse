package Inheritance;

public class ChildSample extends ParentSample {
	int a,b;
	public void show(int x,int y) {
		a=x;
		b=y;
		System.out.println("a="+a+"\tb="+b);
	}

	public void display() {
		super.show();// to call to parent class method
		this.show();// to call to current class method
		show();// to call to current class method
		System.out.println("Test display");
	}

}
