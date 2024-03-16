package com.R2.as4;
import java.util.*;

public class Display {
	private String name;
	private String type;
	private int noWheel;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Car Name:		");
		this.name = sc.nextLine();
		System.out.println("Car Type:		");
		this.type = sc.nextLine();
		System.out.println("Car No of wheels:		");
		this.noWheel = sc.nextInt();
	}

	
	public void printRecord() {
		System.out.println("CAR NAME: " + this.name);
		System.out.println("CAR TYPE: " + this.type);
		System.out.println("CAR NO OF WHEELS: " + this.noWheel);
	}
	
}
