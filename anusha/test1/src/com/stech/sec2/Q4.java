package com.stech.sec2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		int[] a ={8,15,26,45,89,94,96,99};
		System.out.println("enter the bnumber you want to search:");
		Scanner sc=new Scanner (System.in);
		int l=0;
		int h= a.length-1;
		int num=sc.nextInt();
	    boolean flag=false;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(num==a[m])
			{
				flag=true;
				System.out.println("number is found at a["+m+"]");
				break;
				}
			else if(num>a[m])
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
		}
		if(flag==false){
			System.out.println("number not found");
			
		}
		sc.close();
		
		
	}
	
}
