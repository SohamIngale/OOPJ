package com.example;

public class Employee {
	private String name;
	private int empid;
	private int age;
	private float salary;
	
	public Employee(String name, int empid, int age, float salary) {
		this.name = name;
		this.empid = empid;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

