package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class ReverseOfaNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,r=0,rev=0;
	System.out.println("enter the number:");
	n=s.nextInt();
	while(n>=1){
		r=n%10;
		n=n/10;
		rev=rev*10+r;
	}
	System.out.println("reverse is:"+rev);
	s.close();
}
}
