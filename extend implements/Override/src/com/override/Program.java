package com.override;

class Employee{
	String name;
	String dept;
	String designation;
	int age;
	int empid;
	
	
	public Employee(String name,String dept,String designation,	int age,int empid) {
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.age = age;
		this.empid = empid;
	}
	
	
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
}

public class Program {
	public static void main(String[] args) {
		
	}
	public static void main2(String[] args) {
		
	}
	
	public static void main1(String[] args) {
		Employee emp = new Employee("Soham","S.W","GET",23,1232);
		System.out.println(emp.toString());
		

	}

}
