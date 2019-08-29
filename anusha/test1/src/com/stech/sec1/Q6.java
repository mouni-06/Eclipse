package com.stech.sec1;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r=0,rev=0,temp;
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while (n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("reverse is:"+rev);
			if(temp==rev)
			{
				System.out.println(temp+" palindrome");
				sc.close();
			}
	}

}
