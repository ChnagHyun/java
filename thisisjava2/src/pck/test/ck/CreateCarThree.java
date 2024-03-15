package pck.test.ck;

/*2.생성자를 이용한 초기화 */
class CarThree {
	String kind = "쎼단";
	String modelName;
	String carColor;
	int carYear;
	
	CarThree() {		     // 생성자(디폴트생성자 : 입력이 없는 생성자)
		System.out.printf("나는 디폴트 생성자입니다.\n");
	}
	CarThree(String modelName) {
		this.modelName = modelName;
		System.out.printf("나는 매개변수 한개를 갖는 생성자입니다.\n");
	}
	CarThree(String modelName, String carColor, int carYear) {
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
		System.out.printf("나는 매개변수 세개를 갖는 생성자입니다.\n");
	}	
	
}

public class CreateCarThree {
	public static void main(String[] args) {
		//CarThree c = new CarThree("쎼단");		//자동으로 디폴트생성자가 호출된다.
		CarThree c1 = new CarThree("마티즈", "검정", 2023);
		System.out.printf("나의 차는 %s %s 이고 색깔은 %s이고 연식은 %d식 입니다.",
				c1.modelName, c1.kind, c1.carColor, c1.carYear);
	}
}
