package com.sailotech.mounika.test;

import java.util.Scanner;

public class LargestOfFour {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1,n2,n3,n4;
	System.out.println("enter 4 numbers:");
	n1=s.nextInt();
	n2=s.nextInt();
	n3=s.nextInt();
	n4=s.nextInt();
	int big = n1;
	if(n2>big)
	{
		big=n2;
	}
	if(n3>big)
	{
		big=n3;
			}
	if(n4>big)
	{
		big=n4;
	}
	System.out.println("greater = "+big);
	s.close();
	}
}
