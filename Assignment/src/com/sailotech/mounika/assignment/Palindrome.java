package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,r=0,rev=0,temp;
	System.out.println("enter the number:");
	n=s.nextInt();
	temp=n;
	while(n>=1){
		r=n%10;
		n=n/10;
		rev=rev*10+r;
	}
	System.out.println("reverse is:"+rev);
	if(temp==rev){
		System.out.println(temp+"is plaindrome number");
	}
	s.close();
}
}
