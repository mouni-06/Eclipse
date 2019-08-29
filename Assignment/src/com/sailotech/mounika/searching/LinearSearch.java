package com.sailotech.mounika.searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]=new int[]{56,78,23,7,43,35,90,50,31,06};
		int num;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number u want to search:");
		num=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
			   flag=true;
				System.out.println("number "+num+" found");
			}
		}
		if(flag==false)
		{
			System.out.println("number not found in the list.");
		}
		s.close();	
	}
}
