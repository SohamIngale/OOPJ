package com.practice;
class Person{
	int name;
	int age;
	
	class Test{
		private int number = 10;
		public void print( ) {
			System.out.println("Number	:	"+this.number);
		}
	}
	public Person() {}
	
	public Person(int name, int age) {
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
	
	public Employee() {}
	
	public Employee(int empid, int sal) {
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
		
		Person.Test t1 = new Person().new Test();
		t1.print();
		System.out.println("---------------------------------------------");
		Person.Test t2 = new Person().new Test();
		t2.print();
		
	}
}
