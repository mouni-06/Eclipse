package com.sailotech.mounika.test;

import java.util.Arrays;

public class SecondMaxOfArray {
public static void main(String[] args) {
	int [] a=new int[]{10,90,45,78,20};
	int len=a.length;
	System.out.println("length:"+len);
	Arrays.sort(a);
	System.out.print("sorted array is: " );
	for(int i=0;i<len;i++)
	{
		
		System.out.print(a[i]+" ");
	}
	
	System.out.println("\nfirst maximum: "+a[len-1]+"\nSecond Maximum: "+a[len-2]);
}
}
