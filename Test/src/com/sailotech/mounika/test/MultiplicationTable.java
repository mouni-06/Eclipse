package com.sailotech.mounika.test;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,n;
	System.out.println("enter table want:");
	n=s.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(n+"*"+i+"="+(n*i));
	}
s.close();
}
}
