package com.sailotech.mounika.staticKeyword;

public class ObjCounterTest {
	public static void main(String[] args) {
		/*we can access the static data 
		  by the class name also W.O creating any object */
		System.out.println(ObjCounter.counter);
		ObjCounter.counter=ObjCounter.counter+10;
		System.out.println(ObjCounter.counter);
		
		
		
	}

}
