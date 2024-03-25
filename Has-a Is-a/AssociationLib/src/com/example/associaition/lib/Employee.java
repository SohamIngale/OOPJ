package com.example.associaition.lib;

public class Employee {
	private String name;	//null
	private int empid;		//0
	private float salary;	//0.0
	//null
	
	public Employee() {	
	}
	
	public Employee(String name, int empid, float salary, int day, int month, int year) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;

	}

	
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
