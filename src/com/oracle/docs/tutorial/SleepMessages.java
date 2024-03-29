package com.oracle.docs.tutorial;

public class SleepMessages {
    public static void main(String args[]) throws InterruptedException {
    	
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        
        for (String s : importantInfo) {

            //Print a message
            System.out.println(s);
            
            //Pause for 4 seconds
            Thread.sleep(4000);
        }

    }
}