package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class SumOfLastAndFirstDigits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,Last,First = 0,sum=0,middle;
	System.out.println("enter number:");
	n=s.nextInt();
    Last=n%10;
   middle=n/10;
    while(n!=0){
    	First=middle%10;
	   n=n/10;
    }
    sum=First+Last;
	System.out.println("sum of first and last digits:"+sum);
	s.close();
}
}
