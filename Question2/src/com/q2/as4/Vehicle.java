package com.q2.as4;
import com.R2.as4.Display;
import java.util.*;

public class Vehicle {
	private static Scanner sc  = new Scanner(System.in);
	public static int menuList() {
	System.out.println("0. Exit");
	System.out.println("1. Enter");
	System.out.println("2. Show");
	System.out.println("ENTER CHOICE: ");
	return sc.nextInt();
	}
		
	
	public static void main(String[] args) {
		
		
		//d1.acceptRecord();
		//d1.printRecord();
/*
		Display d2= new Display();
		d2.acceptRecord();
		d2.printRecord();

		Display d3= new Display();
		d3.acceptRecord();
		d3.printRecord();
		*/
		int choice;
		Display d1= new Display();
		
		while((choice = Vehicle.menuList())!=0){
			switch( choice) {
			case 1:
					d1.acceptRecord();
					break;
			case 2:
					d1.printRecord();
					break;
			}
			
			
		}
		
		

	}

}
