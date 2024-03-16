package com.day5.cdac;

import java.util.*;

class Details{
	 private String name;
	 private int rollNo;
	 private int marks;	 
	 
	 public void acceptRecord() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Name:	:");
		 this.name=sc.nextLine();
		 System.out.println("RollNo	:");
		 this.rollNo=sc.nextInt();
		 System.out.println("Marks	:");
		 this.marks=sc.nextInt();
		 	 
	 }
	 
	 public void printRecord() {
		 System.out.println("NAME: " + this.name);
		 System.out.println("ROLLNO: " + this.rollNo);
		 System.out.println("TYPE: " +this.marks);
	 }
}

