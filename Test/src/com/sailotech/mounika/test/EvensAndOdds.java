package com.sailotech.mounika.test;

import java.util.Scanner;

public class EvensAndOdds {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num;
	System.out.println("enter the number:");
	num=s.nextInt();
	System.out.println("evens are:");
	for(int i=1;i<=num;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
	System.out.println("odds are:");
	for(int i=1;i<=num;i++){
		if(i%2!=0){
			System.out.println(i);
		}
	}
	s.close();
}
}
