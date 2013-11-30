package com.hoursaday.CsharpVsJava;

import java.util.*;

public class WorkerThread extends Thread {
	
	private Integer id;
	private static int numThreadsMade = 1;
	private ThreadSample owner;
	
	public WorkerThread(ThreadSample owner) {
		super("Thread #" + numThreadsMade);
		id = new Integer(numThreadsMade++);
		this.owner = owner;
		start();
	}
	
	public void run() {
		Random r = new Random(System.currentTimeMillis());
		int timeout = r.nextInt() % 1000;
		
		if (timeout < 0) timeout *= -1;
		
		try { Thread.sleep(timeout); }
		catch (InterruptedException e) { System.out.println("Thread #" + this.id + "interrupted"); }
		
		owner.workCompleted(this);
	}
	
	public Integer getIdNumber() { return id; }
}
