package com.sailotech.mounika.doubleDimensionArrays;

import java.util.Scanner;

public class TwoDArray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[][]={ {2,3,4},{5,6,7},{8,9,10} }; //compile time initialization
	int i,j;
	
	for(i=0;i<a.length;i++)
	{
		System.out.println();
	  for(j=0;j<a[i].length;j++)
	  {
		  System.out.print(a[i][j]+" ");
	  }
	}
	s.close();
}
}
