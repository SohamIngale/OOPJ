//CONSOLE DOES NOT WORK IN ECLIPSE
package in.acts.cdac;

import javax.swing.JOptionPane;

public class Console {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Name: ");
		int empid = Integer.parseInt(JOptionPane.showInputDialog("Enter ID: "));
		float sal = Float.parseFloat(JOptionPane.showInputDialog("Enter Salary: "));
		
		System.out.println(name+"		"+empid+"		"+sal);

	}

}
