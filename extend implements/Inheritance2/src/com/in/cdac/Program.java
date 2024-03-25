package com.in.cdac;
class A{
	private int num1;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
}
class B extends A{
	private int num2;
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B( );
		b.setNum1(10);
		b.setNum2(20);
		
		System.out.println("Num1	:	"+b.getNum1());
		System.out.println("Num2	:	"+b.getNum2());
	}	
}

