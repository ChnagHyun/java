package org.name.calc05;

public class Calc {
	int x;
	int y;
	
	Calc(int x, int y) {			//생성자 7행~9행
	this.x = x;
	this.y = y;
	}	 	  
	public int plus() {
		int result = x+y;
		System.out.println("x + y = " + (x+y));
		return result;
	}
	public int minue() {
		int result = x-y;
		System.out.println("x - y= " + (x-y));
		return result;
	}
	public int mul() {
		int result = x*y;
		System.out.println("x * y= " + (x*y));
		return result;
	}
	public int div() {
		int result = x/y;
		System.out.printf("x / y= %.2f" ,(double)x/y);
		return result;
	}
}
