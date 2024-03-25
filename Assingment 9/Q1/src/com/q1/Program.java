package com.q1;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("enter num1: ");
			int num1=sc.nextInt();
			System.out.println("enter num1: ");
			int num2=sc.nextInt();
	
			if (num2==0){
				throw new ArithmeticException ("cannot divide by zero");
			}
			int sum = num1/num2;
			System.out.println("sum is: "+sum);
		}catch(ArithmeticException ex) {
			System.out.println("Inside catch block"); 
			ex.printStackTrace();
		
		}finally{
			sc.close();
		}
	}

}
