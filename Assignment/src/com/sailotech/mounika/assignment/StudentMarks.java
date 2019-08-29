package com.sailotech.mounika.assignment;

import java.util.Scanner;

public class StudentMarks {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int s1,s2,s3,s4;
	System.out.println("enter 4 subjects marks:");
	s1=s.nextInt();
	s2=s.nextInt();
	s3=s.nextInt();
	s4=s.nextInt();
    if(s1>=40){
    	      if(s2>=40){
    		            if(s3>=40){
    			                  System.out.println("PASS");
    		                      }else if(s4>=40)
    		                            {
    			                          System.out.println("PASS");
    		                            }else{
    			                              System.out.println("FAIL");
    		                                 }
                        }
           }else if(s2>=40){
    	                   if(s3>40){
    		                       if(s4>=40){
    			                              System.out.println("PASS");
    		                                 }else{
    		                                	   System.out.println("FAIL");
    		                                      }
    		                         }else{
    		                        	 System.out.println("FAIL");
    		                              }
                           }else {
    	                          System.out.println("FAIL");
    	                         }
    s.close();
}
}
		
	
	


