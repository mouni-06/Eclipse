package com.sailotech.mounika.test;

import java.util.Scanner;

public class DisplayArrayElements {
public static void main(String[] args) {
	int [] a=new int[5];
	int i,len;
	Scanner s=new Scanner(System.in);
	System.out.println("enter array elements:");
	for(i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("array elements are:");
    for(i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
    len=a.length;
    System.out.println("length of array is:"+len);
s.close();
}
}
