package com.sailotech.mounika.sortings;

public class BubbleSorting {
public static void main(String[] args) {
	int [] a={10,8,12,18,5,3};
	
	System.out.println ("before sorting ");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	//bubble sorting
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	System.out.println();
	System.out.println ("After sorting ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
}
}


