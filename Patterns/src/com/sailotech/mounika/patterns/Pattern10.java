package com.sailotech.mounika.patterns;

import java.util.Scanner;

public class Pattern10 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,j,sp,n;
	System.out.println("enter number:");
	n=s.nextInt();
	
	/*----part 1------
	loop for no.of rows */
	for(i=1;i<=n;i++)
	{
		System.out.println();
		//loop for spaces
		for(sp=n;sp>i;sp--)
		{
			System.out.print("  ");
		}
		//loop for printing numbers
		for(j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
	}
	/*----part 2------
	loop for no.of rows */
	for(i=i-2;i>=1;i--)
	{
		System.out.println();
		//loop for spaces
		for(sp=n;sp>i;sp--)
		{
			System.out.print("  ");
		}
		//loop for printing numbers
		for(j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
	}
	s.close();
	}
}
