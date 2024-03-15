package ch04.sec05;

public class PinrtFrom1To10Example {
	public static void main(String[] agrs) {
		int i = 1;
		/*while (i<=10) {
			System.out.print(i + " ");
			i++;*/			//while문은 i++이 맨 밑으로 
		
		for(i=1 ; i<=10; i++) {				//for문은 i++를 위에
			System.out.print(i + " ");
		}
	}
}
