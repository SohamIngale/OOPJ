package com.q4.as5;
import java.util.*;

class EBill{
	private String name;
	private double unitsConsumed;
	private double billAmount;
	public String calculateBillAmount;
	
	
public EBill(String name, double unitsConsumed){
	this.name = name;
	this.unitsConsumed = unitsConsumed;
	this.billAmount = 0; 
}

//setter
/*
public void setName(String name) {
	this.name = name;
}
public void setUnitsConsumed(double unitsConsumed) {
	this.unitsConsumed = unitsConsumed;
}
public void setBillAmount(double billAmount) {
	this.billAmount = billAmount;
}

//getter

public String getName() {
	return this.name;
}
public double getUnitsConsumed() {
	return this.unitsConsumed;
}
public double getBillAmount() {
	return this.billAmount;
}

*/

public double calculateBillAmount() {
	if (unitsConsumed >=0 && unitsConsumed <=100  ) {
		billAmount = unitsConsumed*5;
		//System.out.println(billAmount);
	}
	else if (unitsConsumed >=100 && unitsConsumed <=300  ) {
		billAmount = 100*5+(unitsConsumed-100)*7;
		//System.out.println(billAmount);
	}
	else {
		billAmount = 500+(200*7)+(unitsConsumed-300)*10;
		//System.out.println(billAmount);
	}
	return this.billAmount;  
}

public void display() {
	System.out.println(billAmount);
}
}

public class Program {
	public static void main(String[] args) {

		EBill b = new EBill("Soham",225.25);
		System.out.println("Your bill amount is :" + b.calculateBillAmount());
		b.display();
				
			}

		

	}

