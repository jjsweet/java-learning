package com.oracle.docs.tutorial;

public class DataStructure {
    // create an array
    private final static int SIZE = 17;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        // print out values of even indices of the array
        InnerEvenIterator iterator = this.new InnerEvenIterator();
        while (iterator.isValid()) {
            System.out.println(iterator.getValue() + " ");
        }
    }
    
    // inner class implements the Iterator pattern
    private class InnerEvenIterator {
        // start stepping through the array from the beginning
        private int index = 0;
        
        public boolean isValid() {
            // check if a current element is the last in the array
            return (index < DataStructure.SIZE);
        }
        
        public int getValue() {
            // record a value of an even index of the array
            int retValue = arrayOfInts[index];
            //get the next even element
            index += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        // fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}