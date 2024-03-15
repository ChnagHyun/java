package com.박창현;

public class MethodTest {
	int num;
	String name;
	
	public static void method1() {		//method1 선언, 정의(입력x, 출력x
		System.out.println("method1() 실행");
	}
	public static void method2(int num) {
		System.out.println("나는 입력하나갖는 메서드" + num);
	}
	public static int method3(int num) {
		int n;
		System.out.printf("나는 입력과 출력이 있는 메서드:  입력%d, 출력 %d\n", num, num);
		n = num;
		return n;						//메서드의 출력
	}
	
	public static void main(String[] args) {
		method1();				//method()메서드 호출 -> 실행
		method2(100);
		int res = method3(1);
		System.out.println("리턴 값: " + res);
	}
}
