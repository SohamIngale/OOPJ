package com.r3.as4;
import java.util.Scanner;
public class Deets {
	private String name;
	private String dept;
	private int empid;
	private float salary;
	
	
	
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		this.name = sc.nextLine();
		System.out.println("Enter Dept: ");
		this.dept = sc.nextLine();
		System.out.println("Enter EmpID: ");
		this.empid = sc.nextInt();
		System.out.println("Enter Salary: ");
		this.salary = sc.nextFloat();		
	}
	
	public void printRecord(){
		System.out.println("NAME OF EMPLOYEE: " + this.name);
		System.out.println("DEPT OF EMPLOYEE: " + this.dept);
		System.out.println("EMPID OF EMPLOYEE: " + this.empid);
		System.out.println("SALARY OF EMPLOYEE: " + this.salary);
	}
	
	
	
	

}


































