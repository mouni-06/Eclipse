package com.sailotech.mounika.test;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num;
	boolean flag;
	System.out.println("enter number:");
	num=s.nextInt();
	flag=true;
	for(int i=2;i<num;i++){
		if(num%i==0){
			flag=false;
		}
	}
	if(flag==true){
		System.out.println("prime");
	}else{
		System.out.println("not prime");
	}
	s.close();
}
}
