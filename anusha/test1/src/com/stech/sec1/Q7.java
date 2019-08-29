package com.stech.sec1;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		boolean flag;
		System.out.println("enter the number");
		num=sc.nextInt();
		flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			flag=false;
			
		}
		if(flag==true)
		{
			System.out.println("prime");
				
	}
	else
	{
		System.out.println("not prime");
		sc.close();
		}

}
}
