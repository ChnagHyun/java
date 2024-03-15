package pck.test.ck;

public class ArrTest01 {
	public static void arrPrint(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.printf("a[%d] : %d\n", i, a[i]);	
		}
		
	}
	public static void main(String[] args) {
		
		int[] ary = {10, 20, 30, 40, 50};						//int ary[] 로 작성가능, 배열선언과 동시에 초기화
		for(int i=0; i< ary.length; i++) {                      //배열일 경우 무조건 for문
			System.out.printf("ary[%d] : %d\n",i, ary[i]);
			System.out.println("ary[" + i + "]:" + ary[i]);			
		}	
		
		/* 배열선언과 초기화가 분리되면 명시적으로 객체생성(new 연산자를 통해서 배열객체 생성)*/
		int[] ary1;			//배열 선언
		ary1 = new int[] {50, 60, 70, 80, 90, 100};	//초기화
		
		arrPrint(new int[] {1, 2, 3});	//초기화를 하지 않은 상태라서 아래에 따로 초기화를 실행하도록 만듬
		arrPrint(ary);	//12행에 있는 ary는 초기화가 된 상태이므로 그것을 가져와서 실행
		}	
	}

