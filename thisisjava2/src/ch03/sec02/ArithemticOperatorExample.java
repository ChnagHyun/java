package ch03.sec02;

public class ArithemticOperatorExample {
	public static void main(String[] args) {
		byte v1 =10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int reselt1 = v1 + v2;		//모든 피연산자는 int 타입으로 자동 변환 후 연산
		System.out.println("reselt1: " + reselt1);
		
		long reselt2 = v1 + v2 -v4;	//모든 피연산자는 long 타입으로 자동 변환 후 연산
		System.out.println("reselt2: " + reselt2);
		
		double reselt3 = (double) v1/ v2;	//double 타입으로 강제 변환 후 연산
		System.out.println("reselt3: " + reselt3);
		
		int reselt4 = v1 % v2;
		System.out.println("reselt4: " + reselt4);
				
	}
}
