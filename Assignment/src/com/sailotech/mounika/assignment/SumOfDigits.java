package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,sum=0,r;
	System.out.println("enter number:");
	n=s.nextInt();
	while(n>=1)
	{
		r=n%10;
		n=n/10;
		sum=sum+r;
	}
	System.out.println("sum of digits:"+sum);
	s.close();
}
}
