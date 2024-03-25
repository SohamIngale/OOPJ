package com.q2;

import java.util.Scanner;

public class Program {
	public static void getNum() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a num: ");
			int num = sc.nextInt();
			if(num%2!=0) {
				throw new ArithmeticException("number is odd");
			}
			System.out.println("the given num "+num+", is even");
			}catch(ArithmeticException ex){
				System.out.println("inside catch block");
				
				
			}
		}
	public static void main(String[] args) {
		Program.getNum();

	}

}
