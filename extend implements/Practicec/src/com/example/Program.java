package com.example;

import java.util.Scanner;


class Shape{
	protected float area;
	
	public Shape() {}
	
	public float getArea() {
		return this.area;
	}
	
	public void calculateArea() {
		
	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////	




class Rectangle extends Shape{
	private float length;
	private float breadth;

	
	public Rectangle(){
		
	}

	public void setArea(float area) {
		this.area = area;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea(){
		this.area = this.length * this.breadth;
	}
}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////	

class Circle extends Shape{
	private float radius;
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea(){
		this.area = (float)( Math.PI * Math.pow(radius, 2));
	}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////		

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		
		System.out.println("0. exit.");
		System.out.println("1. rectangle");
		System.out.println("2. circle");
		System.out.println("Enter Choice");
		return sc.nextInt();
	}


	private static void acceptRecord(Shape shape) {
		if(shape instanceof Rectangle) {
		Rectangle rect = (Rectangle) shape; //downcasting
		System.out.println("Enter length: ");
		rect.setLength(sc.nextFloat());
		System.out.println("Enter breadth: ");
		rect.setBreadth(sc.nextFloat());
		shape.calculateArea();
		}else {
			Circle c = (Circle) shape;
			System.out.println("Enter radius: ");
			c.setRadius(sc.nextFloat());
			c.calculateArea();
		}
	}

	private static void printRecord(Shape shape) {
		
		System.out.println(shape.getArea());
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////		
	
	
	public static void main(String[] args) {
		int choice;
		while((choice = Program.menuList())!=0) {
			Shape shape = null;
			switch (choice) {
			case 1:
				shape = new Rectangle(); //upcasting
				break;
			case 2:
				shape = new Circle(); //upcasting
				break;
			}
			if(shape!=null) {
				Program.acceptRecord(shape);
				shape.calculateArea(); //dynamic method dispatch
				Program.printRecord(shape);
			}
		}
	}
}
