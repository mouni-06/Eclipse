package com.sailotech.mounika.sampleExamples;

public class Sample {
private int empid;
private float empSalary;
private String address;
public void display(int x,float y,String z)
{
	empid=x;
	empSalary=y;
	address=z;
	System.out.println("Employee details....");
	System.out.println("Id: "+x+"Salary: "+y+"Address"+z);
}
}
