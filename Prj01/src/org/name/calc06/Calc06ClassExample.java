package org.name.calc06;

public class Calc06ClassExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double x = 1.2;
		double y = 2.4;
		
		plus(a, b);
		plus(x, y);
		plus(a);
		plus(a, x);
		plus(x, a);
	}		
		
		public static void plus(int a,int b) {
			int res = a + b;
			System.out.printf("res: %d\n", res);
		}
		
		public static void plus(double a,double b) {
			double res = a + b;
			System.out.printf("res: %f\n", res);
		}
		
		public static void plus(int a) {
			int res = a;
			System.out.printf("res: %d\n", res);
		}
		
}
