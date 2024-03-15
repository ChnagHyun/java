package org.name.calc02;

import java.util.Scanner;

public class Calc02Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("몇단을 입력할까요?");
			int a = sc.nextInt();
		 
		int i;
		
		for(i=1; i<=9; i++) {							//(조건 반복문) 변수 i를 1이라고 하고 하나씩 증가하는데 최대 9까지, 9넘어가면 for문을 벗어난다.
			System.out.println(a+"x"+ i + "=" + a * i);
	   } 
   }	
}
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요. ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 하나 더 입력해.");
		String var = sc.nextLine();
		
		String var1 = sc.nextLine();
		
		if(var1. equals("+")) {
			System.out.println("더한값이" + (num1 + num2));
		} else if(var1. equals("-")) {
			System.out.println("뺀값이" + (num1 - num2)); 
		} else if(var1. equals("*")) {
			System.out.println("곱한값이" + (num1 * num2));
		} else if(var1. equals("/")) {
			System.out.println("나눈값이" + (double)(num1 * num2));
		}
	}
}		*/

