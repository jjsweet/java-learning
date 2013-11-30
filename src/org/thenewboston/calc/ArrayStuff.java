package org.thenewboston.calc;

public class ArrayStuff {

	    public static void main(String[] args) {
	        
	        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
	            'i', 'n', 'a', 't', 'e', 'd'};
	            
	        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
	        
	        java.util.Arrays.fill(copyTo, 'x');
	        
	        System.out.println(new String(copyTo));
	    }

}
