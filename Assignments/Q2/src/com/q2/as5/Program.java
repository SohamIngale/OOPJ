package com.q2.as5;

import java.util.Scanner;
//NEW CLASS WHERE GETTER,SETTER AND INSTANCE VARS ARE ADDED
class Attri{
	private String name;
	private double height;
	private double weight;
	private double bmi;
	
	
	//GETTER
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getBMI() {
		bmi = (((this.weight/(this.height*this.height))));
		return bmi;
	}
	
	
	//SETTER
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setBMI(double bmi) {
		this.bmi = bmi;
	}

	
	
}

//CLASS PROGRAM CONTAINS MAIN, ACCEPT-PRINT RECORDS, MENULIST AND CALLS
public class Program {
	private static Scanner sc = new Scanner(System.in);

public static void acceptRecord(Attri atb) {
	System.out.println("Enter name: ");
	sc.nextLine();
	atb.setName(sc.nextLine());
	System.out.println("Enter height: ");
	atb.setHeight(sc.nextDouble());
	System.out.println("Enter weight: ");
	atb.setWeight(sc.nextDouble());
	
}


public static void printRecord(Attri atb) {
	System.out.println("HELLO " + atb.getName());
	System.out.println("YOUR HEIGHT IS: " + atb.getHeight());
	System.out.println("YOUR WEIGHT IS: " + atb.getWeight());
	System.out.printf("YOUR BMI IS: %.2f\n",atb.getBMI());
}


public static int menuList() {
	System.out.println("<CHOOSE ONE OPTION>");
	System.out.println("0. EXIT PROGRAM ");
	System.out.println("1. Enter details ");
	System.out.println("2. Show BMI");
	return sc.nextInt();
}

	public static void main(String[] args) {
	int choice;	
	
	Attri atb = new Attri(); //instance
	
	
	
	while((choice=Program.menuList())!=0) {
		switch(choice) {
		case 1:
			Program.acceptRecord(atb);
			break;
		case 2:
			Program.printRecord(atb);
			break;
		}
		
	}
	
	

	}

}
