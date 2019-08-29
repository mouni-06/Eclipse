package com.sailotech.mounika.doubleDimensionArrays;

import java.util.Scanner;

public class PassingArgumentsForUnknown2DArrayExample1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.of rows u want:");
	int row=sc.nextInt();
	System.out.println("enter no.of columns u want:");
	int col=sc.nextInt();
	int array[][]=new int[row][col];
	int i,j;
	System.out.println("enter array  elements:");
	//scanning array elements
	for(i=0;i<array.length;i++)
	{
		for(j=0;j<array[i].length;j++)
		{
			array[i][j]=sc.nextInt();
		}
		
	}
	
	System.out.println("your array is:");
	for(i=0;i<array.length;i++)
	{
		System.out.println();
		for(j=0;j<array[i].length;j++)
		{
			System.out.print(array[i][j]+"  ");
		}
	}
	
	sc.close();
}
}
