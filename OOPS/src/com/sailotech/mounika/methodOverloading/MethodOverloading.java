package com.sailotech.mounika.methodOverloading;

public class MethodOverloading {
private int i;
private float f;
private double d;
private String str;
public  void setData(int x)
{
	i=x;
	f=0.0f;
	d=0;
	str="\0";
	
}
public  void setData(float y)
{
	i=0;
	f=y;
	d=0;
	str="\0";
	
}
public  void setData(int x,float y)
{
	i=x;
	f=y;
	d=0;
	str="\0";
}
public  void setData(int x,float y,String z)
{
	i=x;
	f=y;
	d=0.0;
	str=z;
}
public  void setData(int x,float y,String z,double w)
{
	i=x;
	f=y;
	str=z;
	d=w;
	
}
public void display()
{
	System.out.println("value of int:"+i+"\tvalue of float:"+f+"\tvalue of double:"+d+"\tvalue of float:"+str);
}
}
