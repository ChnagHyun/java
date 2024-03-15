package com.박창현;

public class PrintTest {
	public static void main(String[] args) {
		String name = "박창현";
		int age = 28;
		System.out.println("나의 이름은 " + name + " 나이는 " + age + "입니다");
		System.out.println("나의 이름은 " + name + "\n나이는" + age + "입니다");
		System.out.printf("나의 이름은 %s이고 나이는 %d입니다", name, age);	
		// %s: 문자      %d: 숫자
	}
}