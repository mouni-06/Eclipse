package com.sailotech.mounika.sortings;

public class InsertionSorting {
	public static void main(String[] args) {
		int [] a={10,8,12,18,5,3};
		
		System.out.println ("before sorting ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		 for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[i];
					a[i] = a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		 System.out.println();
System.out.println("after sorting ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
}
}
