package com.stech.sec1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int n=0,i,evensum=0,oddsum=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;	
			}
		}
		System.out.println("sum of even:"+evensum+"\nsum of odd:"+oddsum);
		sc.close();
	}

}
