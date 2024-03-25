package com.in.cdac;
class A{
	int num1;
	int num2;

	public A() {
		this.num1 = 1;
		this.num2 = 2;
	}
	public A(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void showRecord() {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
	public void printRecord() {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
}
class B extends A{
	int num3;
	int num4;
	
	public B() {
		int num3=3;
		int num4=4;
	}
	public B(int num1, int num2, int num3, int num4){
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	public void displayRecord() {
		super.showRecord();
		System.out.println("Num3	:	"+this.num3);
		System.out.println("Num4	:	"+this.num4);
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Num3	:	"+this.num3);
		System.out.println("Num4	:	"+this.num4);
	}
}
public class Program {
	public static void main(String[] args) {
		
		A a = new A();
		a.num1 = 10;
		a.num2 = 20;
		
		System.out.println("=====================================");
		
		B b = new B( );
		b.num1 = 11;
		b.num2 = 12;
		b.num3 = 30;
		b.num4 = 40;
		b.displayRecord();
		System.out.println("=====================================");
		b.printRecord();
		System.out.println("=====================================");
		b.showRecord();
		System.out.println("=====================================");
		

	}	
}

