package com.sailotech.mounika.test;

import java.util.Scanner;

public class NumberSeries {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
	int i,j,n;
	System.out.println("enter n value:");
	n=s.nextInt();
	for(i=1,j=2;i<=n && j<=n; ){
		System.out.print(i+" "+j+" ");
		i=i+1;
		j=j+2;
	}
s.close();
}
}
   













                                         
                                                       