package com.q3.as5;
import java.util.*;
import java.util.Scanner;

class Book{
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;


public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
	this.title = title;
	this.author = author;
	this.publisher= publisher;
	this.isbn = isbn;
	this.year = year;
	this.price = price;
	this.quantity = quantity;
}
	
//getter
public String getTitle() {
	return this.title;
}
public String getAuthor() {
	return this.author;
}
public String getPublisher() {
	return this.publisher;
}
public String getIsbn() {
	return this.isbn;
}
public int getYear() {
	return this.year;
}
public double getPrice() {
	return this.price;
}
public int getQuantity() {
	return this.quantity;
}


//setter
public void setTitle(String title) {
	this.title = title;
}
public void setAuthor(String author) {
	this.author= author;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public void setYear(int year) {
	this.year = year;
}
public void setPrice(double price) {
	this.price = price;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public void increaseQuantity(int quantity) {
	if(quantity>=0) {
		this.quantity+=quantity;
	}
	else {
		System.out.println("Enter positive value");
	}
}
	

public void decreaseQuantity(int quantity) {
	if(quantity>=0&& this.quantity>=quantity) {
		this.quantity-=quantity;
	}
	else {
		System.out.println("insufficient quantity");
	}
}

public double getInventoryValue() {
	double invertoryValue=price*quantity;
	return price*quantity;
}
	
}




public class BIMSProgram {

		public static void main(String[] args) {
		Book b = new Book("Dune", "Frank Herber","Chilton Books","9754827640",1965,397.20,5);
		
		System.out.println("quantity of book: "+ b.getQuantity());
		b.increaseQuantity(3);
		System.out.println("quantity of book: "+ b.getQuantity());
		b.decreaseQuantity(4);
		System.out.println("quantity of book: "+ b.getQuantity());
		System.out.println("inventory value of book: "+ b.getInventoryValue());


		/*
			
			String title = b.getTitle();
			String author = b.getAuthor();
			String publisher = b.getPublisher();
			String isbn = b.getIsbn();
			int year = b.getYear();
			double price = b.getPrice();
			int quantity = b.getQuantity();
		*/
		
		
	}
	
}
