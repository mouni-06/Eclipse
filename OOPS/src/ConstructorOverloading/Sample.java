package ConstructorOverloading; //based on no.of args

public class Sample {
	private  int a;
	private  int b;
	private  int c ;

	public Sample() {
		a=0;
		b=0;
		c=0;
	}
	public Sample(int x) {
		a=x;
		b=0;
		c=0;
	}
	public Sample(int x, int y) {
		a=x;
		b=y;
		c=0;
	}
	public Sample(int x, int y, int z) {
		a=x;
		b=y;
		c=z;
	}
	void display() {	
		System.out.println (  "a= " + a + " b= " +b+" c= " +c);
	}


}
