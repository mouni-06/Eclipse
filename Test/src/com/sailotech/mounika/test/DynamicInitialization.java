package com.sailotech.mounika.test;

public class DynamicInitialization {
public static void main(String[] args) {
	int a=20,b=10; //static init ...(compile time)
	int c1,c2;
	System.out.println("value of a:"+a+"\tb:"+b);
	c1=a+b;    //dynamic init...(runtime)
	c2=a-b;    //dynamic init...(runtime)
	System.out.println("value of c1:"+c1+"\tc2:"+c2);
}
}
