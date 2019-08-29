package com.sailotech.mounika.test;

import java.util.Scanner;

public class SumOfN {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num,sum=0;
	System.out.println("enter number:");
    num=s.nextInt();
    for(int i=0;i<=num;i++){
    	sum+=i;
    }
    System.out.println("sum of"+num+"numbers is:"+sum);
    s.close();
}
}
