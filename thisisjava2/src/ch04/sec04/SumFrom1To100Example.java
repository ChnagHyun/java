package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] agrs) {
		int sum = 0; //누적시키는 0은 반드시 초기화 시켜야 한다.
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
