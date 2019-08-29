package com.sailotech.mounika.test;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	String str1,str2;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter string1");
	str1=scanner.nextLine();
	System.out.println("enter string2");
	str2=scanner.next();	// this method scans upto space/token
	System.out.println(str1);
	System.out.println(str2);
	scanner.close();
 
	/*
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	a=s.nextInt();
	System.out.println("enter b:");
	b=s.nextInt();
	System.out.println("a:"+a+"\tb:"+b);
	s.close();
	*/
}
}
