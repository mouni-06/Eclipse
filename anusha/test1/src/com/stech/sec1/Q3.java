package com.stech.sec1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n;
		long fact=1;
		 n= sc.nextInt();
		 while (n>=1)
		 {
			 fact=fact*n;
			 n--;
			 
		 }
		 System.out.println("factorial value"+fact);
		 sc.close();
	}

}