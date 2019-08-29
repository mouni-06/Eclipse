package com.sailotech.mounika.staticKeyword;

public class Sample1 {
	private int i;
	private float f;
	private static int j;
	public void setData()
	{
		i=j;
		f=++j;
	}
	public void display()
	{
		System.out.println("i :"+i+"\tf :"+f+"\tj:"+j);
	}
}
