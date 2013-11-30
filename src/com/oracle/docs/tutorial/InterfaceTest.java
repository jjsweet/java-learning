package com.oracle.docs.tutorial;

public class InterfaceTest implements CharSequence {

	String s = "";
	
	public InterfaceTest(String s) {
		StringBuilder sb = new StringBuilder(s);
		this.s = sb.reverse().toString();
	}
	
	@Override
	public char charAt(int index) {
		return s.charAt(index);
	}

	@Override
	public int length() {
		return s.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return s.subSequence(start, end);
	}
	
	@Override
	public String toString() {
		return s.toString();
	}
	
	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest("Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards. Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods.");
		
		System.out.println(it.charAt(10));
		System.out.println(it.length());
		System.out.println(it.subSequence(1, 20));
		System.out.println(it.toString());
		System.out.println(it.getClass());
		
	}

}
