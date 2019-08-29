package ConstructorOverloading;

public class ArgumentTypeTest {
	public static void main(String [] args ) {

		ArgumentType t1 = new ArgumentType();
		
		 /* int i=10;

		float f = 11.5f;
		char c1 = 'a'; 	*/
		
		ArgumentType t2 = new ArgumentType(10,20.0f);

		ArgumentType t3 = new ArgumentType(2.0f,'v');

		t1.display();

		t2.display();
			
		t3.display();
	}

}
