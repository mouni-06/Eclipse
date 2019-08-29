package com.sailotech.mounika.test;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	int a,b,c;
	Scanner s= new Scanner(System.in);
	System.out.println("enter value of a:");
	a=s.nextInt();
	System.out.println("enter the value of b:");
	b=s.nextInt();
	System.out.println("before swapping:\na ="+a+"\tb ="+b);
	c=a+b;
	a=c-a;
	b=c-b;
	System.out.println("after swapping:\na ="+a+"\tb ="+b);
	s.close();
}
}
