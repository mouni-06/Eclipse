package com.sailotech.mounika.staticKeyword;

public class ObjCounter {
	private  int n;
	static int counter;

	public void setData() {
		n = ++counter;
	}
	

	public void display() {
		System.out.println ("Current Object " + n);
		System.out.println ("Total Objects " + counter);
	}

}
