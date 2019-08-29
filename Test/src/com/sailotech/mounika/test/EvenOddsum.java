package com.sailotech.mounika.test;

import java.util.Scanner;

public class EvenOddsum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n,esum = 0,osum=0;
	System.out.println("enter n value:");
	n=s.nextInt();
	for(int i=1;i<=n;i++){
		if(i%2 == 0){
			esum=esum+i;
			
		}
		else{
			osum=osum+i;
			
		}
	}
	System.out.println("sum of even:"+esum);
	System.out.println("sum of odd:"+osum);
	s.close();
}
}
