package com.sailotech.mounika.test;

public class TypeCasting {
public static void main(String[] args) {
	byte a=10;
	//implicit conversion (small--->big)
	short s=a;     //byte --->short
	int i=a;       //byte---->int
	long l=a;      //byte---->long
	float f=a;     //byte---->float
	double d=a;    //byte---->double
	
	System.out.println("value of s:"+s);    //output:10
	System.out.println("value of i:"+i);    //output:10
	System.out.println("value of l:"+l);    //output:10
	System.out.println("value of f:"+f);    //output:10.0
	System.out.println("value of d:"+d);    //output:10.0
	short s1=123;
	int i1=s1;
	float f1=s1;
	System.out.println("value of i1:"+i1);    //o.p:123
	System.out.println("value of f1:"+f1);    // o.p:123.0
	char c='B';
	int i2=c;
	float f2=c;
	System.out.println("value of i2:"+i2);    // o.p:66
	System.out.println("value of f2:"+f2);    //o.p:66.0
	float f3=4.5f;
	long L1=(long)f3;  //w.o typecasting(Explicit) we cant convert real.num to integer.
	System.out.println("value of L1:"+L1); 
	
	
	
	
	
	//explicit conversion(big size to small size)
	double d1=234456788.976655;
	int i3=(int)d1;  // double to int
	System.out.println("value of i3:"+i3);     // o.p:2344456788
	long L2=(long)d1;  // double to long
	System.out.println("value of L2:"+L2);     // o.p:234456788
	short s2=167;   
	byte b=(byte)s2;   //double to short
	System.out.println("value of b:"+b);   // o.p:-89
}
}
