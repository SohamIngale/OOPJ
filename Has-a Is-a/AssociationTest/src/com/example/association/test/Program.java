package com.example.association.test;

import com.example.associaition.lib.Employee;

//Define EmployeeTest class

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee( "Sandeep", 31, 45000.50f, new Date(1, 9, 2021) );
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
		Date joinDate = emp.getJoinDate();	
		System.out.println("Join Date	:	"+joinDate.getDay()+" / "+joinDate.getMonth()+" / "+joinDate.getYear());
 	}
	public static void main3(String[] args) {
		Employee emp = new Employee( "Sandeep", 31, 45000.50f );
		emp.setJoinDate( new Date(1, 9, 2021) );
		
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
		Date joinDate = emp.getJoinDate();	
		System.out.println("Join Date	:	"+joinDate.getDay()+" / "+joinDate.getMonth()+" / "+joinDate.getYear());
 	}
	public static void main2(String[] args) {
		Employee emp = new Employee( "Sandeep", 31, 45000.50f, 1,1,2007);
				
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());
	
		System.out.println("Join Date	:	"+joinDate.getDay()+" / "+joinDate.getMonth()+" / "+joinDate.getYear());
 	}
	public static void main1(String[] args) {
		Employee emp = new Employee();
				
		System.out.println("Name	:	"+emp.getName());
		System.out.println("Empid	:	"+emp.getEmpid());
		System.out.println("Salary	:	"+emp.getSalary());

		System.out.println("Join Date	:	"+joinDate.getDay()+" / "+joinDate.getMonth()+" / "+joinDate.getYear());	//NullPointerException
 	}
}
