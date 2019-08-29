package com.sailotech.mounika.test;

public class IDExample {
public static void main(String[] args) {
	int i=4;
	int j=3;
	int z1=i++ + ++j + ++i + j++ ;
	System.out.println("i:"+i+"j:"+j);
	int z2=i++ - ++j + ++i - j++ ;
	System.out.println("z1:"+z1);
	System.out.println("z2:"+z2);
}
}
