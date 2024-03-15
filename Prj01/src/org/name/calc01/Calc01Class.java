package org.name.calc01;

import java.util.Scanner;

public class Calc01Class {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("1>>");
		String str = sc.nextLine();
		
		System.out.print("2>>");
		int inputD = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("3>>");
		String str1 = sc.nextLine();
		
		System.out.println(str + inputD + str1);
		
		sc.close();
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. ");
		int number1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요. ");
		int number2 =sc.nextInt();
		
		System.out.println("두 정수의 더한 값입니다. " + (number1 + number2));
		System.out.println("두 정수의 뺀 값입니다. " + (number1 - number2));
		System.out.println("두 정수의 곱한 값입니다. " + (number1 * number2));
		System.out.println("두 정수의 나눈 값입니다. " + (number1 / number2));			
	}
}
