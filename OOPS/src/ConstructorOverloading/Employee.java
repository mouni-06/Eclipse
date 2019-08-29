package ConstructorOverloading;

public class Employee {
private String ename;
private int id;
private String dept;
private String company;
Employee()
{
	ename=null;
	id=0;
	dept=null;
	company="sailotech";
}
Employee(String ename,int id,String dept,String company)
{
	this.ename=ename;
	this.id=id;
	this.dept=dept;
	this.company=company;
}
public void display()
{
	System.out.println(ename+"\t"+id+"\t"+dept+"\t"+company);
}
}
