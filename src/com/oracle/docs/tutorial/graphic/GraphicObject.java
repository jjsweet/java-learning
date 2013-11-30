package com.oracle.docs.tutorial.graphic;

public abstract class GraphicObject {
	
	int x, y;
	
	void moveTo(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	
	abstract void draw();
	abstract void resize();
}
