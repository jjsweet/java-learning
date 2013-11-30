package org.thenewboston.calc;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1, n2, answer;
		System.out.println("Enter first num: ");
		n1 = scanner.nextDouble();
		System.out.println("Enter second num: ");
		n2 = scanner.nextDouble();
		answer = n1 + n2;
		
		System.out.println(answer);
	}

}
