package com.stech.sec1;

public class Q1 {
 public static void main(String[] args) {
	 int sub1=55;
	 int sub2=60;
	 int sub3=20;
	 
	  if( sub1>=40 && sub2>=40 && sub3>=40)
	  {
		  System.out.println("pass");
		  int avg=(sub1+sub2+sub3)/3;
		  if(avg>=70)
		  {
			  System.out.println("grade a with distniction");
		  }
		  else if(avg>=60)
		  {
			  System.out.println("grade a");
			  
		  }
		  else if(avg>=50)
		  {
			  System.out.println("grade b");
		  }
		  else
		  {
			  System.out.println("grade c");
		  }
	  }
	  else
	  {
		  System.out.println("fail");
	  }
	 
 }		 
}
