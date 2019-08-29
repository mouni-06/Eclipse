package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int year;
	System.out.println("enter year:");
	year=s.nextInt();
	if( (year%4==0 && year%100!=0 )|| year%400==0){
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
	s.close();
}
}
