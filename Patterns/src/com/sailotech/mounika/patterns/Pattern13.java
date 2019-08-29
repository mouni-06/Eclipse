package com.sailotech.mounika.patterns;

import java.util.Scanner;

public class Pattern13 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,j,n;
	System.out.println("enter number:");
	n=s.nextInt();
	for(i=n; i>=1; i--)
	{
		System.out.println();
		for(j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		
		for(j=n; j>i; j--)
		{
			System.out.print("  ");
		}
		
		for(j=n; j>i; j--)
		{
			if(j==n)
			{
				continue;
			}
			System.out.print("  ");
		}
		for(j=i; j>=1; j--)
		{
			if(j==n)
			{
				continue;
			}
			System.out.print(j+" ");
		}
		
	}
	
	for(i=i+2; i<=n; i++)
	{
		System.out.println();
		for(j=1; j<=i; j++)
		{
			System.out.print(j+" ");
		}
		
		for(j=n; j>i; j--)
		{
			System.out.print("  ");
		}
		
		for(j=n; j>i; j--)
		{
			if(j==n)
			{
				continue;
			}
			System.out.print("  ");
		}
		for(j=i; j>=1; j--)
		{
			if(j==n)
			{
				continue;
			}
			System.out.print(j+" ");
		}
		
	}
s.close();
	}
	
}

