package com.oracle.docs.tutorial;

import java.util.Random;

public class RefPassTest {
	
	public static void incPoint(Point p) {
		p.setX(p.getX() + 1);
		p.setY(p.getY() + 1);
	}
	
	public static void copyPoint(Point p) {
		Point p2 = p;
		
		p2.setX(p2.getX() + 1);
		p2.setY(p2.getY() + 1);
	}
	
	public static void changeString(String s) {
		s = s + " add";
	}
	
	public static void changeString2(String s) {
		s = s.concat(" two");
	}

	public static void main(String[] args) { 

		Point p = new Point(0, 0);
		System.out.format("x = %d, y = %d, t = %d%n", p.getX(), p.getY(), p.getT());
		
		incPoint(p);
		System.out.format("x = %d, y = %d, t = %d%n", p.getX(), p.getY(), p.getT());

		copyPoint(p);
		System.out.format("x = %d, y = %d, t = %d%n", p.getX(), p.getY(), p.getT());
		
		Point p2 = new Point(0, 0);
		System.out.format("x = %d, y = %d, t = %d%n", p2.getX(), p2.getY(), p2.getT());
		
		
		
		String s = "mystring";
		System.out.println(s);
		
		changeString(s);
		System.out.println(s);
		
		changeString2(s);
		System.out.println(s);
	}
	
	public static class Tester { 
		private int x = 0;
		public Tester(int x) {
			this.x = x;
		}
		public int getX() { return x; }
	}
	
	private static class Point {
		private int x;
		private int y;
		private Tester t = fillT();
		
		private final Tester fillT() {

			Random r = new Random(System.currentTimeMillis());
			int timeout = r.nextInt() % 1000;
			if (timeout < 0) timeout *= -1;
			
			return new Tester(timeout);
		}
		
		@SuppressWarnings("unused")
		static final double PI = 3.141592653589793;
		
		@SuppressWarnings("unused")
		public Point() {
			this(0, 0);
		}
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void setY(int y) {
			this.y = y;
		}
		
		public int getX() { 
			return x;
		}
		
		public int getY() { 
			return y;
		}
		
		public int getT() {
			return this.t.getX();
		}
	}

}
