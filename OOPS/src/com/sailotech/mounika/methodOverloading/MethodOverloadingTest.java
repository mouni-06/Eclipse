package com.sailotech.mounika.methodOverloading;

public class MethodOverloadingTest {
public static void main(String[] args) {
	MethodOverloading method_Overloading=new MethodOverloading();
	method_Overloading.setData(1);
	method_Overloading.setData(10.0f);
	method_Overloading.setData(10,20.0f);
	method_Overloading.setData(10,20.00f,"sailotech");
	method_Overloading.setData(10,30.0f,"sailotech",30.0);
	method_Overloading.display();
}
}
