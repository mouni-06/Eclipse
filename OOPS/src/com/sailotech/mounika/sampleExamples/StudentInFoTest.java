package com.sailotech.mounika.sampleExamples;

public class StudentInFoTest {
public static void main(String[] args) {
	StudentInfo studentInfo1=new StudentInfo();
	studentInfo1.setStudentRno(101);
	studentInfo1.setAge(20);
	studentInfo1.setName("Student1");
	studentInfo1.setDept("cse");
	studentInfo1.diplayStudentInfo();
	System.out.println("after updating student marks");
	studentInfo1.setAge(70);
	studentInfo1.diplayStudentInfo();
	
	
}
}
