package ConstructorOverloading;

public class SampleTest {
	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample(10,20);
		Sample s4=new Sample(30,40);
		//Sample s5=new Sample(10,20,30);
s1.display();
s2.display();
s3.display();
s4.display();
	}
}