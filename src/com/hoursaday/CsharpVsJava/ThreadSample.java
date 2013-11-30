package com.hoursaday.CsharpVsJava;

import java.util.Vector;

public class ThreadSample {
	
	private Vector<Integer> threadOrderList = new Vector<Integer>();
	
	private Integer nextInLine(){
		return (Integer)threadOrderList.firstElement();
	}
	
	private void removeNextInLine() { 
		threadOrderList.removeElementAt(0);
		
		// all threads have shown up
		if (threadOrderList.isEmpty()) System.exit(0);
	}
	
	public synchronized void workCompleted(WorkerThread worker) {
		while (!worker.getIdNumber().equals(nextInLine())) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting for Thread #" + nextInLine() + " to show up.");
				wait();
			}
			catch (InterruptedException e) {}
		}
		
		System.out.println("Thread #" + worker.getIdNumber() + " is home free");
		
		// Remove this thread from the list yet to be seen:
		removeNextInLine();
		
		// Tell all other threads to resume:
		notifyAll();
	}

	public static void main(String[] args) throws InterruptedException { 
		
		ThreadSample ts = new ThreadSample();
		
		for (int ii = 0; ii < 25; ii++) {
			WorkerThread wt = new WorkerThread(ts);
			ts.threadOrderList.add(wt.getIdNumber());
		}
		
		Thread.sleep(3600000);

	}

}
