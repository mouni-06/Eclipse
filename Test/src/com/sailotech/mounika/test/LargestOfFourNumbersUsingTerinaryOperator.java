package com.sailotech.mounika.test;

import java.util.Scanner;

public class LargestOfFourNumbersUsingTerinaryOperator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1,n2,n3,n4;
	int Largest;
	System.out.println("Enter 4 numbers:");
	n1=s.nextInt();
	n2=s.nextInt();
	n3=s.nextInt();
	n4=s.nextInt();
	Largest= (((n1>n2)&&(n1>n3))&&(n1>n4))?n1:
		         (
			    	((n2>n3)&&(n2>n4))?n2:
			    		( 
			    				(n3>n4)?n3:n4
			    		)
		         )
			;
			
		System.out.println(Largest);	
	s.close();
}
}
