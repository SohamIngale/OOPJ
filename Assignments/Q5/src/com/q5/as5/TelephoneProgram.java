package com.q5.as5;
import java.util.*;
class Input{
	String name;
	long number;
	int npcm;
	int duration;
	double bill;

//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setNPCM(int npcm) {
		this.npcm = npcm;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	
	
//getter
	
	public String getName() {
		return this.name;
	}
	public long getNumber() {
		return this.number;
	}
	public int getNPCM() {
		return this.npcm;
	}
	public int getDuration() {
		return this.duration;
	}
	public int getBill() {
	if(npcm<=100 && duration>=60) {
		bill = (0.50*npcm)+10;
	}
	else if(npcm>100 && duration >=60) {
		bill = (0.50*npcm+((npcm-100)*.25))+10;
	}
	else {
		System.out.println("invalid");
	}
	return (int)bill;
	
	}
	
	
	
	


}



public class TelephoneProgram {
private static Scanner sc = new Scanner(System.in);
public static void acceptRecord(Input ip) {
	System.out.println("enter name: ");
	sc.nextLine();
	ip.setName(sc.nextLine());
	System.out.println("enter your number: ");
	ip.setNumber(sc.nextLong());
	System.out.println("enter npcm: ");
	ip.setNPCM(sc.nextInt());
	System.out.println("enter duration: ");
	ip.setDuration(sc.nextInt());
	
}
public static void printRecord(Input ip) {
	System.out.println("Hello, " + ip.name);
	System.out.println("Your number is: "+ ip.number);
	System.out.println("your bill is : " + ip.getBill());
}

public static int menuList() {
	System.out.println("<CHOOSE ONE OPTION>");
	System.out.println("0. EXIT PROGRAM ");
	System.out.println("1. Enter details ");
	System.out.println("2. Show bill");
	return sc.nextInt();

}
	public static void main(String[] args) {
		int choice;
		Input ip = new Input();
		while((choice = TelephoneProgram.menuList())!=0) {
			switch (choice) {
			case 1:
				TelephoneProgram.acceptRecord(ip);
				break;
				
			case 2:
				TelephoneProgram.printRecord(ip);
				break;
			}
		}
	}
}
				
				





