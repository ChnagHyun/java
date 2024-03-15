package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 1000000000000; //int로 인식되어서 생기는 오류, Long 범위에서 벗어나므로 뒤에 L을 붙여주어야 오류가 안뜬다
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
