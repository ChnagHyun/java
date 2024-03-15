package com.박창현;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();
		
		System.out.printf("나의 이름은 %s이고 나이는 %d입니다", name, age);
	}
}
