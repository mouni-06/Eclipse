package com.sailotech.mounika.sampleExamples;

public class StudentInfo {
private int student_rno;
private int age;
private String name;
private String dept;
  

public void setStudentRno(int student_rno)
{
	this.student_rno=student_rno;
}
public void setAge(int age)
{
	this.age=age;
}
public void setName(String name)
{
	this.name=name;
}
public void setDept(String dept)
{
	this.dept=dept;
}
public void diplayStudentInfo()
{
	System.out.println("student details......");
	System.out.println("Student R.no:"+student_rno+"\tage:"+age+"\tname:"+name+"\tDept:"+dept);
}
}
