package com.sailotech.mounika.test;

import java.util.Scanner;

public class SwitchExample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.println("enter the num:");
	x=sc.nextInt();
	switch(x)
	{
	case 1: 
		System.out.println("case1 Statement");
	break;
	case 2:
		System.out.println("case2 statement");
	break;
	default:
		System.out.println("default");
		break;
	}
sc.close();
}
}
