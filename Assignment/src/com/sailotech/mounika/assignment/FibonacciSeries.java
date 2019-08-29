package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int F=0,S=1,temp=0,n;
	System.out.println("enter n value:");
	n=s.nextInt();
	while(F<=n){
		System.out.print(F+" ");
		temp=F+S;
		F=S;
		S=temp;
	}

	s.close();
}
}
