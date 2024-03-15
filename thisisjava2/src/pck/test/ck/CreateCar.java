package pck.test.ck;

class Car{
	String modelName;			//멤버변수 == 필드 == 속성
	String carColor;
	int carYear;
}

public class CreateCar {
	
	public static void main(String[] args) {
		/* car 타입의 변수 c에 car 클래스의 객체를 집어넣어라. */
		Car c1 = new Car();		//객체생성(디폴트 생성자 호출)
		// int = 100;
		Car c2 = new Car();
		Car c3 = new Car();		
		
		c1.modelName="테슬라";
		c2.modelName="롤스로이스";
		c3.modelName="부가티";
		
		System.out.println(c3.modelName);
		System.out.println(c3.carColor);
		System.out.println(c3.carYear);
	}
}
