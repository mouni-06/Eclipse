package com.sailotech.mounika.test;

import java.util.Scanner;

public class SkipEven {
public static void main(String[] args) {
	int num;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	num=s.nextInt();
	System.out.println("even numbers within"+num+":");
	for(int i=2;i<=num;){
		
		if(i%2==0){
			System.out.println(i);
			i++;
		}else{
			i++;
		}
	}
	s.close();
}
}
