package prac.springBootAssignment4;

import java.util.Random;

public class Triangle {
	private int base;
	private int height;
		 
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public double getArea(int base, int height) {
		return 0.5 * this.base * this.height;
	}

	public void draw() {
		System.out.println("Height of Triangle : "+height);
		System.out.println("Base of Triangle : "+base);
		for(int i=0;i<500;i++) {System.out.print(".");}
		System.out.println("Function Exection Complete");
    }
}