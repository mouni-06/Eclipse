package com.sailotech.mounika.searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]=new int[]{06,23,45,55,57,62,75,81,90,95};
		int num,low,High,Mid;
	    low=0;
		High=a.length-1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number u want to search:");
		num=s.nextInt();
		while(low <= High)
		{
			Mid=(low+High)/2;
			if(num==a[Mid])
			{
				System.out.println("number found at a["+Mid+"] location");
				break;
			}
			else if(num > a[Mid])
			{
				low=Mid+1;
			}
			else if(num < a[Mid])
			{
				High=Mid-1;
			}
		}
		s.close();
	}
}
