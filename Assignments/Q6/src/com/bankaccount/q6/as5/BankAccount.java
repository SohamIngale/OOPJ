package com.bankaccount.q6.as5;

import java.util.Scanner;

class Account{
	String name;
	int accnum;
	double bal;
	double add;
	double withdraw;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int accnum) {
		this.accnum = accnum;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return accnum;
	}
	public double getBal() {
		return bal;
	}
	
	
	public int addBal() {
		bal = bal + add;
		return (int) bal;
	}
	
	
	public void increaseBalance(double bal) {
		if(bal>=0) {
			this.bal+=bal;
		}
		else {
			System.out.println("Enter positive value");
		}
	}
		

	public void decreaseBalance(int bal) {
		if(bal>=0&& this.bal>=bal) {
			this.bal-=bal;
		}
		else {
			System.out.println("insufficient balance");
		}
	}

	public double getCurrBalance() {
		double currBalance=bal;
		return currBalance;
	
}
	public void depositMoney(Account a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number  ");
		int anum = sc.nextInt();
		if (this.accnum == anum) {
			System.out.print("How Money You Wanted To Add   :  ");
			int n = sc.nextInt();
			this.bal+= n;
		}
	}

public void withdrawMoney(Account a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number  ");
		int anum = sc.nextInt();
		if (this.accnum == anum) {
			System.out.print("How Many Quantity You Want To Decrease  :  ");
			int n = sc.nextInt();

			if (this.bal< n) {
				this.bal-= n;

			} else {
				System.out.println("Sorry You Don't Have Sufficient Balance   !");
			}
		} else {
			System.out.println("Enter Valid Account Number  ");
		}
	}




public class BankAccount {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void acceptRecord(Account a) {
		
		System.out.println("enter Name: ");
		sc.nextLine();
		a.setName(sc.nextLine());
		System.out.println("enter number: ");
		a.setNum(sc.nextInt());
		System.out.println("enter starting balance: ");
		a.setBal(sc.nextDouble());
	}
		
	public static void acceptAdd(Account a) {
		System.out.println("enter adding balance: ");
		a.setBal(sc.nextDouble());

	}
	public static void printRecord(Account a) {
		System.out.println("Hello, " + a.name);
		System.out.println("Your account number is: "+ a.accnum);
		System.out.println("your current balance is : " + a.getCurrBalance());
	}
		
		
	
	/*	
	}
	public static void addBalance(Account a) {
		System.out.println("enter the amount to add: " + a.addBal());
	}
		
	public static void withdrawBalance(Account a) {
		System.out.println("enter amount to withdraw: " + a.addBal());
	}
	public static void getCurrBal(Account a) {
		
		System.out.println("your current balance is: " + a.getCurrBalance());
	}
		*/
		
		
		
	
	
	public static int menuList() {
		System.out.println("BANK ACCOUNT MANAGEMENT SYSTEM");
		System.out.println("<CHOOSE ONE OPTION>");
		System.out.println("0. EXIT PROGRAM ");
		System.out.println("1. Create Account ");
		System.out.println("2. Show Account Details ");
		System.out.println("3. Add to Balance");
		System.out.println("4. Withdraw Cash");
		System.out.println("5. Show Current Balance");
		return sc.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		int choice;
		Account a = new Account();
		
		while((choice= BankAccount.menuList())!=0) {
			switch (choice) {
			case 1: 
				BankAccount.acceptRecord(a);	
				break;
			case 2:
				BankAccount.printRecord(a);
				break;
			case 3: 
				
				BankAccount.depositMoney();
				break;
			case 4:
				BankAccount.withdrawMoney();
				break;
			case 5:
				BankAccount.getCurrBal(a);
				break;
			
			}
			
		}
		// TODO Auto-generated method stub

	}

}

}
