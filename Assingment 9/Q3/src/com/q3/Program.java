package com.q3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30};
		try {
			System.out.print("enter an index number: ");
			int index = sc.nextInt();
			if(index>2) {
				throw new ArrayIndexOutOfBoundsException("INVALID INDEX");
				
			}
			System.out.println(arr[index]);	
		}catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}finally {
			sc.close();
		}
		
		

	}

}
