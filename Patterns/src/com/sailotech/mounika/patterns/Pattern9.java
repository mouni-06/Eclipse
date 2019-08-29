package com.sailotech.mounika.patterns;

import java.util.Scanner;

public class Pattern9 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,j,n,sp;
	System.out.println("enter number:");
	n=s.nextInt();
	//loop for no.of rows
	for(i=n;i>=1;i--){
		System.out.println();
		//loop for spaces
		for(sp=n;sp>i;sp--){
			System.out.print("  ");
		}
		//loop for printing numbers
		for(j=1;j<=i;j++){
			System.out.print(j+" ");
		}
	}
	s.close();
}
}
