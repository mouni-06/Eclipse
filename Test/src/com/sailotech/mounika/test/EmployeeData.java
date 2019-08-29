package com.sailotech.mounika.test;
public class EmployeeData {
public static void main(String[] args) {
	String str="mounika";
	int empno=535;
	float salary=20000;
	char gender='F';
	System.out.println("Employee name:"+str+"\tEmpno:"+empno+"\tsalary:"+salary+"Gender:"+gender);
	//override
	str="anusha"; 
	empno=5345;
	System.out.println("Employee name:"+str+"\tEmpno:"+empno+"\tsalary:"+salary+"Gender:"+gender);
}
}
