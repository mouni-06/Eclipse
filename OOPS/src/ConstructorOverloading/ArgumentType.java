package ConstructorOverloading;

public class ArgumentType {
	private  int a;
	private  float b;
	private  char ch;

	public ArgumentType() {
		a=0;
		b=0.0f;
		ch=0;
	}

	public ArgumentType(int x, float y ) {
		a=x;
		b=y;
	}

	public ArgumentType(int x, char y) {
		a=x;
		ch=y;
	}

	public ArgumentType(float x, char y) {
		b=x;
		ch=y;
	}

	void display() {

		System.out.println ("a= "+a+" b= "+b+" ch= "+ch );
	}

}
