package com.sailotech.mounika.test;

import java.util.Scanner;

public class OddNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,n;
	System.out.println("enter n value:");
	n=s.nextInt();
	
	/* using while loop
	while(i<=n){
		if(i%2 !=0){
			System.out.println(i);
		}
		i++;
	}  */
	
	//using for loop
	for(i=1;i<=n;i++){
		if(i%2 != 0){
			System.out.println(i);
		}
	}
	s.close();
}
}
