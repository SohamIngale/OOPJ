package com.practice;
class Person{
	String name;
	int age;
	
	class Test{
		private int number = 10;;
		public void print( ) {
			System.out.println("Number	:	"+this.number);
		}
	}
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayRecord() {
		System.out.println("name: "+ this.name);
		System.out.println("age: "+ this.age);
	}

}
public class Employee extends Person{
	int empid;
	int sal;
	
	public Employee() {
		this.empid = 0;
		this.sal = 0;
	}
	
	public Employee(int empid, int sal) {
		this.empid = empid;
		this.sal = sal;		
	}
	
	public Employee(String name,int age, int empid, int sal) {
		super(name, age);
		this.empid = empid;
		this.sal = sal;		
	}
	
	public void printRecord() {
		this.displayRecord();
		System.out.println("empid: "+ this.empid);
		System.out.println("sal: "+ this.sal);
	}
	
	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.displayRecord();
		//emp.printRecord();
		/*
		Person.Test t1 = new Person().new Test();
		t1.print();
		System.out.println("---------------------------------------------");
		Person.Test t2 = new Person().new Test();
		t2.print();
		*/
		
		Person p1 = new Person();
		
		Person p2 = new Person("Soham", 23);

		Employee e1 = new Employee();
		Employee e2 = new Employee(123,43320);
		Employee e3 = new Employee("Adi",22, 6969, 700000);
		e1.printRecord();
		System.out.println("***********");
		e1.displayRecord();
		System.out.println("--------------------------");
		e2.printRecord();
		System.out.println("***********");
		e2.displayRecord();
		System.out.println("--------------------------");
		e3.printRecord();
		System.out.println("***********");
		e3.displayRecord();
		
		
	}
}
