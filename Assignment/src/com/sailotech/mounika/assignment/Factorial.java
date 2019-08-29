package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n;
	int fact=1;
	System.out.println(" enter n value:");
	n=s.nextInt();
	int temp=n;
	if(n==1)
	{
		System.out.println("factorial of 1 is: "+n);
	}
	else
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*n;
			n--;
		}
	}
	System.out.println("factorial of "+temp+":"+fact);
	s.close();
}
}
