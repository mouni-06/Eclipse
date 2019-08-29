package com.sailotech.mounika.test;

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	int n,i=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter n value");
	n=s.nextInt();
	while(i<=n){
		if(i%2==0){
			System.out.println(i);
		}
		i++;
	}
	s.close();
}
}
