package com.sailotech.mounika.doubleDimensionArrays;

import java.util.Scanner;

public class AdditionOfMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.of rows for matrix1:");
	int row1=sc.nextInt();
	System.out.println("enter no.of columns for matrix1:");
	int col1=sc.nextInt();
	int array1[][]=new int[row1][col1];
	System.out.println("enter no.of rows for matrix2:");
	int row2=sc.nextInt();
	System.out.println("enter no.of columns for matrix2:");
	int col2=sc.nextInt();
	int array2[][]=new int[row2][col2];
	int i,j;
	System.out.println("enter elements for matrix1: ");
	for(i=0;i<array1.length;i++)
	{
		for(j=0;j<array1[i].length;j++)
		{
			array1[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter elements for matrix2: ");
	for(i=0;i<array2.length;i++)
	{
		for(j=0;j<array2[i].length;j++)
		{
			array2[i][j]=sc.nextInt();
		}
	}
	sc.close();
}
}
