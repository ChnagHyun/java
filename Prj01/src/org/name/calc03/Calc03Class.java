package org.name.calc03;

import java.util.Scanner;

public class Calc03Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
		System.out.println("숫자를 적어라");
		int a = sc.nextInt();
		System.out.println("숫자를 적어라");
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자를 적어라");
		String c = sc.nextLine();
		
		if(c.equals("+")) {
			System.out.println("더한값은" + (a+b));
			
		}else if (c.equals("-")) {
			System.out.println("뺸 값은" + (a-b));
			
		}else if (c.equals("*")) {
			System.out.println("곱한값은" + (a*b));
			
		}else if (c.equals("/")) {
			System.out.println("나눈값은" + (a/b));
		}
		System.out.println("계속하려면 아무거나, 그만하려면'q'를 입력하세요.");
		String d = sc.nextLine();
		
		if(d.equals("q")) {
			System.out.println("끝낸다.");
			break;
		}
		}
	}
		
}
