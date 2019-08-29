package com.sailotech.mounika.test;

public class MaxMinOfArray {
public static void main(String[] args) {
	int [] a=new int[]{10,90,45,78,20};
	int length=a.length;
	int i,max=a[0],min=a[0];
	System.out.println("length of an array is:"+length);
	for(i=0;i<length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Maximum of array:"+max+"\t"+"minimum of array:"+min);
}
}
