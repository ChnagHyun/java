package org.name.calc04;

import java.util.Scanner;

public class Calc04Class {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("정수를 입력하세용");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세용");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력해라");
		String var1 = sc.nextLine();
		
		if(var1.equals("+")) {
			plus(num1, num2);
		}else if(var1.equals("-")) {
			minue(num1,num2);			
		}else if(var1.equals("*")) {
			multiply(num1,num2);
		}else if(var1.equals("/")) {
			divide(num1,num2);
		}
				
	}
	public static void plus(int a , int b) {
		System.out.println("더한값은 : " + (a+b));
	}
	public static void minue(int a, int b) {
		System.out.println("뺀값은 : " + (a-b));
	}
	public static void multiply(int a, int b) {
		System.out.println("곱한값은 : " + (a*b));
	}
	public static void divide(int a, int b) {
		System.out.printf("나눈값은 : %.2f" , ((double)a/b));
	}
}
