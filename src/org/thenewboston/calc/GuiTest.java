package org.thenewboston.calc;

import javax.swing.JOptionPane;

public class GuiTest {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Enter first number");
		String s2 = JOptionPane.showInputDialog("Enter second number");
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int sum = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "sum: " + sum, "title", JOptionPane.PLAIN_MESSAGE);

	}

}
