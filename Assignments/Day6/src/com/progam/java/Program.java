package com.progam.java;

import java.util.Scanner;

class Student{
	private String name;
	private int rn;
	private float marks;
	//---------------------------------------------------------------
	//GETTER METHODS
	public String getName() {
		return this.name;
	}

	public int getRn() {
		return this.rn;
	}

	public float getMarks() {
		return this.marks;
	}
//-------------------------------------------------------------------
	//SETTER METHODS
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRn(int rn) {
		this.rn=rn;
	}
	
	public void setMarks(float marks) {
		this.marks=marks;
	}
}
	
//--------------------------------------------------------------------

public class Program {
	private static Scanner sc = new Scanner(System.in);
	

	private static void acceptRecord(Student std) {
		if( std != null) {
			System.out.println("Name: ");
			sc.nextLine();
			std.setName(sc.nextLine());
			System.out.println("Rollno: ");
			std.setRn(sc.nextInt());
			System.out.println("Marks: ");
			std.setMarks(sc.nextFloat());
		}
	}
	
	private static void printRecord(Student std) {
		System.out.println("NAME:     "+std.getName());
		System.out.println("ROLL NUM:     "+std.getRn());
		System.out.println("MARKS:     "+std.getMarks());
		
	}
	
	public static int menuList() {
		System.out.println("<CHOOSE ONE OPTION>");
		System.out.println("0. EXIT PROGRAM ");
		System.out.println("1. ACCEPT ");
		System.out.println("2. PRINT");
		return sc.nextInt();
		 
	}

	public static void main(String[] args) {
		int choice;
		 
		Student std = new Student();
		
		while((choice=Program.menuList())!=0) {
			switch (choice) {
			case 1:	
				Program.acceptRecord(std); 
				break;
			case 2:
				Program.printRecord(std);
				break;
			}
		}
		
		
	
		
		
		
	}
	
	

	

/*	private static void acceptRecord(Student std) {
		if( std != null) {
			System.out.println("Name: ");
			std.setName(sc.nextLine());
			System.out.println("Rollno: ");
			std.setRn(sc.nextInt());
			System.out.println("Marks: ");
			std.setMarks(sc.nextFloat());
		}
	}
	
	private static void printRecord(Student std) {
		System.out.println("NAME:     "+std.getName());
		System.out.println("ROLL NUM:     "+std.getRn());
		System.out.println("MARKS:     "+std.getMarks());
		
	}

	public static void main(String[] args) {
		Student std = new Student();

		Program.acceptRecord(std);
	
		Program.printRecord(std);
		
		
	}
	
	*/

	public static void main2(String[] args) {
		Student std = new Student();
		
		
		System.out.println("Name: ");
		std.setName(sc.nextLine());
		System.out.println("Rollno: ");
		std.setRn(sc.nextInt());
		System.out.println("Marks: ");
		std.setMarks(sc.nextFloat());
		

		System.out.println("NAME:     "+std.getName());
		System.out.println("ROLL NUM:     "+std.getRn());
		System.out.println("MARKS:     "+std.getMarks());
	}
	
	
	
	public static void main1(String[] args) {
		Student std = new Student();
		
		String name = std.getName();
		int rn = std.getRn();
		float marks = std.getMarks();
		
		
		std.setName("Soham");
		std.setRn(20);
		std.setMarks((float) 83.12);
		

		System.out.println("NAME:     "+name);
		System.out.println("ROLL NUM:     "+rn);
		System.out.println("MARKS:     "+marks);
	}

}
