package pck.test.ck;

/* 1. Setter 이용하여 초기화하기 */
class cartwo {
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++ 멤버변수,속성, 필드
	String kind = "쎼단";		//공통적으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++메서드 (메멥함수), 기능, 행위
	public void setModeName(String modeName) {		//메서드
		this.modelName = modeName;
		
	}
	public void setcarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setcarYear(int carYear) {
		this.carYear = carYear;
	}
}
public class CreateCarTwo {
	public static void main(String[] args) {
		cartwo c = new cartwo();		
		
		c.setModeName("롤스로이스");
		c.setcarColor("흰색");
		c.setcarYear(2024);
		System.out.println("나의 차는 " + c.modelName + "이고 색상은 " + c.carColor + "이며 연식은 " + c.carYear + "입니다");
	}
}
